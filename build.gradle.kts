import org.springframework.boot.gradle.tasks.bundling.BootJar

plugins {
	kotlin("jvm") version "1.9.25"
	kotlin("plugin.spring") version "1.9.25"
	id("org.springframework.boot") version "3.4.2"
	id("io.spring.dependency-management") version "1.1.7"
}

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(21)
	}
}

allprojects {
	group = "com.woopii"
	version = "0.0.1-SNAPSHOT"

	repositories {
		mavenCentral()
	}
}

subprojects {
	apply(plugin = "org.jetbrains.kotlin.jvm")

	tasks.withType<JavaCompile> {
		sourceCompatibility = JavaVersion.VERSION_21.toString()
		targetCompatibility = JavaVersion.VERSION_21.toString()
	}

	dependencies {
		// Kotlin
		implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
		implementation("org.jetbrains.kotlin:kotlin-reflect")

		// Spring Web
		implementation("org.springframework.boot:spring-boot-starter-web")

		// JPA
		implementation("org.springframework.boot:spring-boot-starter-data-jpa")
		// H2 Database
		runtimeOnly("com.h2database:h2")

		// Kotest
		testImplementation("io.kotest:kotest-runner-junit5:5.4.2")
		testImplementation("io.kotest:kotest-assertions-core:5.4.2")
		testImplementation("io.kotest.extensions:kotest-extensions-spring:1.1.2")

		// MockK
		testImplementation("io.mockk:mockk:1.13.16")

		testImplementation("org.springframework.boot:spring-boot-starter-test")
		testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
		testRuntimeOnly("org.junit.platform:junit-platform-launcher")
	}
}

kotlin {
	compilerOptions {
		freeCompilerArgs.addAll("-Xjsr305=strict")
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}

// Disable the bootJar task
// 빌드 시 mainclass 문제 해결방법 : https://stackoverflow.com/questions/56861256/gradle-build-failed-main-class-name-has-not-been-configured-and-it-could-not-be
tasks.named<BootJar>("bootJar") {
	enabled = false
}

// Ensure that the jar task is enabled
// final class 해결 방법 https://velog.io/@kdohyeon/may-not-be-final-%ED%95%B4%EA%B2%B0%ED%95%98%EA%B8%B0
tasks.named<Jar>("jar") {
	enabled = true
}
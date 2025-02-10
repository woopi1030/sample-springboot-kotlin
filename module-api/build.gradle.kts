import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	kotlin("jvm") version "1.9.25"
	kotlin("plugin.spring") version "1.9.25"
	id("org.springframework.boot") version "3.4.2"
	id("io.spring.dependency-management") version "1.1.7"
}

dependencies {
	implementation(project(":module-domain"))
	implementation(project(":module-core"))
	implementation(project(":module-service-sample"))
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "21"
	}
}

tasks.withType<JavaCompile> {
	sourceCompatibility = "21"
	targetCompatibility = "21"
}

springBoot {
	mainClass.set("com.woopii.sample_springboot_kotlin.SampleSpringbootKotlinApplicationKt")
}
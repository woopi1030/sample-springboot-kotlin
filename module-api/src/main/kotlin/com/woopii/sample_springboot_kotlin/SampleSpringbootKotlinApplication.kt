package com.woopii.sample_springboot_kotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SampleSpringbootKotlinApplication

fun main(args: Array<String>) {
	runApplication<SampleSpringbootKotlinApplication>(*args)
}

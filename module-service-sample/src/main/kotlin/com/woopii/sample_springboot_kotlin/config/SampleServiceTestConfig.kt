package com.woopii.sample_springboot_kotlin.config

import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@Configuration
@ComponentScan(basePackages = ["com.woopii.sample_springboot_kotlin.service"])
@ComponentScan(basePackages = ["com.woopii.sample_springboot_kotlin.repository"])
class SampleServiceTestConfig {
}
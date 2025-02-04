package com.woopii.sample_springboot_kotlin.controller

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/health")
@RestController
class HealthController(
    @Value("\${profile}") private val profile: String
) {

    @GetMapping
    fun healthCheck(): String{
        return """ 
                ::::: Health Check Ok! :::::
                1. profile : $profile
                """.trimIndent()
    }

}
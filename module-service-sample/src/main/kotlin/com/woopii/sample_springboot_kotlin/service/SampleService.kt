package com.woopii.sample_springboot_kotlin.service

import com.woopii.sample_springboot_kotlin.entity.Sample
import com.woopii.sample_springboot_kotlin.repository.SampleRepository
import org.springframework.stereotype.Service

@Service
class SampleService(
    private val sampleRepository: SampleRepository
) {

    fun getSamples(): List<Sample> {
        return sampleRepository.findAll()
    }

    fun createSample(sample: Sample) : Sample {
        return sampleRepository.save(sample)
    }

}
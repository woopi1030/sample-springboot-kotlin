package com.woopii.sample_springboot_kotlin.repository

import com.woopii.sample_springboot_kotlin.entity.Sample
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface SampleRepository : JpaRepository<Sample, Long> {
}
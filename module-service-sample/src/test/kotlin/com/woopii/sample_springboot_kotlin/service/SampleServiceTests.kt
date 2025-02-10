package com.woopii.sample_springboot_kotlin.service

import com.woopii.sample_springboot_kotlin.config.SampleServiceTestConfig
import com.woopii.sample_springboot_kotlin.entity.Sample
import com.woopii.sample_springboot_kotlin.repository.SampleRepository
import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.ints.shouldBeGreaterThan
import io.kotest.matchers.shouldNotBe
import io.mockk.every
import io.mockk.mockk
import org.junit.jupiter.api.DisplayName
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig

@SpringJUnitConfig(SampleServiceTestConfig::class)
@ActiveProfiles("local")
@DisplayName("Sample Service Tests")
class SampleServiceTests(
    private val sampleService: SampleService
) : BehaviorSpec({

    val sampleRepository: SampleRepository = mockk() // MockK로 Repository 모킹

    Given("get sample list[parameter set]"){

        val sampleResult = listOf (
            Sample(reservedColumn01 = "111"),
            Sample(reservedColumn02 = "222"),
            Sample(reservedColumn03 = "333")
        )

        every { sampleRepository.findAll() } returns sampleResult

        When("call get method") {
            val result = sampleService.getSamples()
            Then("check result") {
                result shouldNotBe  null
                result.size shouldBeGreaterThan  0
            }
        }
    }

}) {
}
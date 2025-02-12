package com.woopii.sample_springboot_kotlin.service

import com.woopii.sample_springboot_kotlin.entity.Sample
import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.ints.shouldBeGreaterThan
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe
import org.junit.jupiter.api.DisplayName
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles

@SpringBootTest
@ActiveProfiles("local")
@DisplayName("Sample Service Tests")
class SampleServiceTests(
    private val sampleService: SampleService
) : BehaviorSpec() {

    // sample get all
    init {
        Given("get sample list[parameter set]"){
            When("call get method") {
                val result = sampleService.getSamples()
                Then("check result") {
                    result shouldNotBe  null
                    result.size shouldBeGreaterThan  0
                }
            }
        }
    }

    //sample save
    init {
        Given("create sample entity"){

            val sample = Sample().apply{
                reservedColumn01 = "111"
                reservedColumn02 = "222"
                reservedColumn03 = "333"
                createdId = "system"
            }

            When("call create method") {
                val createdSample = sampleService.createSample(sample)
                println(createdSample)
                Then("check result") {
                    createdSample shouldNotBe  null
                    createdSample.reservedColumn01 shouldBe "111"
                    createdSample.reservedColumn02 shouldBe "222"
                    createdSample.reservedColumn03 shouldBe "333"
                }
            }
        }
    }

}
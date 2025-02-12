package com.woopii.sample_springboot_kotlin.enums

enum class Status(
    val desc: String
) {
    active("활성"),       // 활성 상태
    deleted("삭제"),      // 삭제 상태
}
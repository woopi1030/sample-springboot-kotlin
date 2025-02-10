package com.woopii.sample_springboot_kotlin.entity.base

import com.woopii.sample_springboot_kotlin.enums.Status
import jakarta.persistence.*
import org.hibernate.annotations.Comment
import java.time.ZoneId
import java.time.ZonedDateTime

@MappedSuperclass
abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Comment("ID")
    @Column(name = "id", nullable = false)
    var id: Long? = null

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    var status: Status = Status.active

    @Column(name = "created_by", updatable = false)
    var createdId: String? = null

    @Column(name = "created_at", updatable = false)
    var createdAt: ZonedDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"))

    @Column(name = "updated_by")
    var updatedId: String? = null

    @Column(name = "updated_at")
    var updatedAt: ZonedDateTime? = null

    @PrePersist
    fun prePersist() {
        val now = ZonedDateTime.now(ZoneId.of("Asia/Seoul"))
        this.createdAt = now
        this.updatedAt = now
    }
    @PreUpdate
    fun preUpdate() {
        this.updatedAt = ZonedDateTime.now(ZoneId.of("Asia/Seoul"))
    }
}
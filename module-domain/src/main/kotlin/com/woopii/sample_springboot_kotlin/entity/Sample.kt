package com.woopii.sample_springboot_kotlin.entity

import com.woopii.sample_springboot_kotlin.entity.base.BaseEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Table

@Table(name = "sample")
@Entity
class Sample (

    @Column(name = "reserved_column_01")
    var reservedColumn01: String? = null,

    @Column(name = "reserved_column_02")
    var reservedColumn02: String? = null,

    @Column(name = "reserved_column_03")
    var reservedColumn03: String? = null,

    @Column(name = "reserved_column_04")
    var reservedColumn04: String? = null,

    @Column(name = "reserved_column_05")
    var reservedColumn05: String? = null,

    @Column(name = "reserved_column_06")
    var reservedColumn06: String? = null,

    @Column(name = "reserved_column_07")
    var reservedColumn07: String? = null,

    @Column(name = "reserved_column_08")
    var reservedColumn08: String? = null,

    @Column(name = "reserved_column_09")
    var reservedColumn09: String? = null,

    @Column(name = "reserved_column_10")
    var reservedColumn10: String? = null,

) : BaseEntity() {

}
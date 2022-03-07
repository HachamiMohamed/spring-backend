package com.example.springbackendkotlin.data

import java.io.Serializable
import javax.persistence.*

@Entity
data class Product  (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long? = null,
        var name: String? = null,
        var description: String? = null,
        var currentPrice: Double = 0.0,
        var promotion: Boolean = false,
        var selected: Boolean = false,
        var availabe: Boolean = false,
        var photoName: String? = null,

        @ManyToOne
        var category: Category? = null
): Serializable {
}
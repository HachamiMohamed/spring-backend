package com.example.springbackendkotlin.data

import java.io.Serializable
import javax.persistence.*

@Entity
data class Category(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private var id: Long? = null,
        private var name: String? = null,
        private var description: String? = null,

        @OneToMany(mappedBy = "category")
        private var products: Collection<Product>? = null
): Serializable {

}
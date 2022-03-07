package com.example.springbackendkotlin.dao


import com.example.springbackendkotlin.data.Product
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import org.springframework.web.bind.annotation.CrossOrigin

@CrossOrigin("*")
@RepositoryRestResource
interface ProductRepository : JpaRepository<Product?, Long?>
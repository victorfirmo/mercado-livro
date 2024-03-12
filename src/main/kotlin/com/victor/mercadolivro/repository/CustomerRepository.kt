package com.victor.mercadolivro.repository

import com.victor.mercadolivro.model.CustomerModel
import org.springframework.data.repository.CrudRepository

interface CustomerRepository :CrudRepository<CustomerModel, Int> {

    fun findByNameContaining(name: String): List<CustomerModel>
}
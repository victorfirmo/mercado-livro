package com.victor.mercadolivro.service

import com.victor.mercadolivro.model.CustomerModel
import com.victor.mercadolivro.repository.CustomerRepository
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.PathVariable

@Service
class CustomerService(val customerRepository: CustomerRepository) {

    fun getAll(name: String?): List<CustomerModel> {
        name?.let {
            return customerRepository.findByNameContaining(name)
        }
        return customerRepository.findAll().toList()
    }

    fun create(customer: CustomerModel) {
        customerRepository.save(customer)
    }

    fun getCustomer(@PathVariable id: Int): CustomerModel {
        return customerRepository.findById(id).orElseThrow()
    }

    fun updateCustomer(customer: CustomerModel) {
        if (!customerRepository.existsById(customer.id!!)) {
            throw Exception()
        }
        customerRepository.save(customer)
    }

    fun deleteCustomer(@PathVariable id: Int) {
        if (!customerRepository.existsById(id)) {
            throw Exception()
        }
        customerRepository.deleteById(id)
    }

}
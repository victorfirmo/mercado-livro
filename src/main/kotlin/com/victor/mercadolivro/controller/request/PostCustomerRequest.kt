package com.victor.mercadolivro.controller.request

import com.victor.mercadolivro.model.CustomerModel

data class PostCustomerRequest (
    var name: String,
    var email: String
)

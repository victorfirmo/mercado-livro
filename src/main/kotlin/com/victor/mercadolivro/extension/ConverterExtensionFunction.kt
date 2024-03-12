package com.victor.mercadolivro.extension

import com.victor.mercadolivro.controller.request.PostCustomerRequest
import com.victor.mercadolivro.controller.request.PutCustomerRequest
import com.victor.mercadolivro.model.CustomerModel

fun PostCustomerRequest.toCustomerModel(): CustomerModel {
    return CustomerModel(name = this.name, email = this.email)
}

fun PutCustomerRequest.toCustomerModel(id: Int): CustomerModel {
    return CustomerModel(id = id , name = this.name, email = this.email)
}
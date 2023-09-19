package com.example.kotlinpract1.Data.DataSource.Product

import retrofit2.http.GET

interface ProductApi {
    @GET("products")
    suspend fun getAllProduct(): Products
}
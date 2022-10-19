package com.example.desainpatrenmvp.network

import com.example.desainpatrenmvp.model.DataCar
import com.example.desainpatrenmvp.model.ResponseDataCar
import com.example.desainpatrenmvp.model.ResponseDataCarItem
import retrofit2.Call
import retrofit2.http.*

interface RestfulApi {
    @GET("admin/car")
    fun getAllCar() : Call<List<ResponseDataCarItem>>
    
}
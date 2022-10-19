package com.example.desainpatrenmvp.prenseter

import com.example.desainpatrenmvp.model.ResponseDataCar
import com.example.desainpatrenmvp.model.ResponseDataCarItem
import com.example.desainpatrenmvp.network.RetrofitClien
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CarPresenter(val viewcar : CarView) {
    fun getDataCar(){
        RetrofitClien.instance.getAllCar()
            .enqueue(object : Callback<List<ResponseDataCarItem>> {
                override fun onResponse(
                    call: Call<List<ResponseDataCarItem>>,
                    response: Response<List<ResponseDataCarItem>>
                ) {
                    if (response.isSuccessful){
                        viewcar.onSucces(response.message(), response.body()!!)
                    }else{
                        viewcar.onError(response.message())
                    }
                }

                override fun onFailure(call: Call<List<ResponseDataCarItem>>, t: Throwable) {
                    viewcar.onError(t.message!!)
                }

            })
    }
}
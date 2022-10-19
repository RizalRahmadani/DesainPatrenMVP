package com.example.desainpatrenmvp.prenseter

import com.example.desainpatrenmvp.model.ResponseDataCar
import com.example.desainpatrenmvp.model.ResponseDataCarItem

interface CarView {
    fun onSucces(pesan : String, car : List<ResponseDataCarItem>)
    fun onError(pesan: String)
}
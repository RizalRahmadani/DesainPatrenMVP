package com.example.desainpatrenmvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.desainpatrenmvp.databinding.ActivityMainBinding
import com.example.desainpatrenmvp.model.ResponseDataCar
import com.example.desainpatrenmvp.model.ResponseDataCarItem
import com.example.desainpatrenmvp.prenseter.CarPresenter
import com.example.desainpatrenmvp.prenseter.CarView
import com.example.desainpatrenmvp.view.AdapterCar

class MainActivity : AppCompatActivity(), CarView {
    lateinit var binding : ActivityMainBinding
    lateinit var presnter : CarPresenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presnter = CarPresenter(this)
        presnter.getDataCar()

    }

    override fun onSucces(pesan: String, car: List<ResponseDataCarItem>) {
        binding.rvCar.layoutManager = LinearLayoutManager(this)
        binding.rvCar.adapter = AdapterCar(car)
    }

    override fun onError(pesan: String){
        Toast.makeText(this,pesan, Toast.LENGTH_SHORT).show()
    }
}
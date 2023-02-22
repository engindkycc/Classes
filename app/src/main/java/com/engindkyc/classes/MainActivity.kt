package com.engindkyc.classes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.engindkyc.classes.databinding.ActivityMainBinding
import kotlin.Number

class MainActivity : AppCompatActivity() {
        lateinit var  binding: ActivityMainBinding
        override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        classWork()

    }

    fun classWork(){

        var superman = SuperHero()
        superman.name = "Superman"
        superman.age  = 50
        superman.job = "journal"

        binding.textxView.text = "Age: ${superman.age}"

    }

}
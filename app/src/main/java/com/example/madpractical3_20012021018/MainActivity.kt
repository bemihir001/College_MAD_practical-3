package com.example.madpractical3_20012021018

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.view.WindowCompat
import com.example.madpractical3_20012021007.LoginActivity

import com.example.madpractical3_20012021018.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)//inflater pass xml
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        binding.bottomnavigationview.setOnItemSelectedListener{ it ->
            when(it.itemId){
                R.id.bottom_nav_reg -> {
                    Intent(this, RegistrationActivity::class.java).also {startActivity(it)}
                }

                R.id.bottom_nav_login -> {
                    Intent(this, LoginActivity::class.java). also {startActivity(it)}
                }
            }
            return@setOnItemSelectedListener true
        }
    }
}
package com.example.madpractical3_20012021018

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.view.View
import android.widget.Toast
import androidx.core.view.WindowCompat
import com.example.madpractical3_20012021007.databinding.ActivityRegistrationBinding

class RegistrationActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegistrationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)

        binding = ActivityRegistrationBinding.inflate(layoutInflater)//inflater pass xml
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        binding.login.setOnClickListener {
            Intent(this,LoginActivity::class.java).also { startActivity(it) }
            binding.login.movementMethod = LinkMovementMethod.getInstance()
        }
        binding.bottomnavigationview.selectedItemId = R.id.bottom_nav_reg
        binding.bottomnavigationview.setOnItemSelectedListener { it ->
            when (it.itemId) {
                R.id.bottom_nav_login -> {
                    Intent(this, LoginActivity::class.java).also { startActivity(it) }
                }
            }
            return@setOnItemSelectedListener true
        }

    }
}
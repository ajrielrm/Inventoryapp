package com.example.inventoryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.example.inventoryapp.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        binding = ActivityRegisterBinding.inflate(layoutInflater)
        window.statusBarColor = ContextCompat.getColor(this, R.color.primary)

        binding.btSignup.setOnClickListener(){
            val goToDashboard = Intent(this, MainActivity::class.java)
            startActivity(goToDashboard)
        }

        binding.btSignin.setOnClickListener(){
            val signIn = Intent(this, LoginActivity::class.java)
            startActivity(signIn)

        }

    }
}
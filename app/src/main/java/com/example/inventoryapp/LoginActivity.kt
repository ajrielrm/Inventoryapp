package com.example.inventoryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.example.inventoryapp.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        window.statusBarColor = ContextCompat.getColor(this, R.color.primary)
        binding.btSignup.setOnClickListener(){
            val signUp = Intent(this, ActivityRegister::class.java)
            startActivity(signUp)

        }

        binding.btSignin.setOnClickListener(){
            val goToDashboard = Intent(this, MainActivity::class.java)
            startActivity(goToDashboard)
        }

        binding.test.setOnClickListener(){
            val search = Intent(this, SearchActivity::class.java)
            startActivity(search)
        }


    }
}
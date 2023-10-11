package com.example.a02_lauragines_login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a02_lauragines_login.databinding.ActivityDetailBinding
import com.example.a02_lauragines_login.model.User

class DetailActivity : AppCompatActivity() {

    companion object {
        const val USER_KEY = "User_email"
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        val binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val extras:Bundle = intent.extras!!
        val bienvenida= "Bienvenido: " + extras.getParcelable<User>(USER_KEY)!!.userEmail
        binding.bienvenidaTextId.text = bienvenida

    }
}
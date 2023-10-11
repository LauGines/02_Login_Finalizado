package com.example.a02_lauragines_login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a02_lauragines_login.databinding.ActivityMainBinding
import com.example.a02_lauragines_login.model.User

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.enterBtnId.setOnClickListener {
            val userEmail = binding.emailId.text.toString()
            val userPassword = binding.passwordId.text.toString()
            val user = User(userEmail, userPassword)
            openDetailActivity(user)
        }
    }

    private fun openDetailActivity(user: User) {
        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra(DetailActivity.USER_KEY, user)
        startActivity(intent)
    }
}
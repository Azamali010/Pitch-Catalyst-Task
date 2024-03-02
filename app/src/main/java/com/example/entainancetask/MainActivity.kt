package com.example.entainancetask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.entainancetask.R.id.bottom_home


class MainActivity : AppCompatActivity() {
    private lateinit var home :View
    private lateinit var chat :View
    private lateinit var cart :View
    private lateinit var profile :View
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        home = findViewById(bottom_home)
        chat = findViewById(R.id.bottom_chat)
        cart = findViewById(R.id.bottom_shopping)
        profile = findViewById(R.id.bottom_profile)

        datasend()


    }

    private fun datasend() {
        home.setOnClickListener{
            val intent = Intent(this,HomeActivity::class.java)
            startActivity(intent)
        }
        chat.setOnClickListener{
            val intent = Intent(this,CartActivity::class.java)
            startActivity(intent)
        }
        cart.setOnClickListener{
            val intent = Intent(this,CartActivity::class.java)
            startActivity(intent)
        }
        profile.setOnClickListener{
            val intent = Intent(this,ProfileActivity::class.java)
            startActivity(intent)
        }
    }
}
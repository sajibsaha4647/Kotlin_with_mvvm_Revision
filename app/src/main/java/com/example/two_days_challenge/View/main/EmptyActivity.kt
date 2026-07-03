package com.example.two_days_challenge.View.main

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.lifecycleScope
import com.example.two_days_challenge.R
import com.example.two_days_challenge.databinding.ActivityEmptyBinding
import com.example.two_days_challenge.databinding.ActivityMainBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class EmptyActivity : AppCompatActivity() {

    private  var binding : ActivityEmptyBinding? = null ;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEmptyBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding?.root)


        lifecycleScope.launch {
            delay(2000) // 2 seconds
            startActivity(Intent(this@EmptyActivity, MainActivity::class.java))
            finish()
        }

    }
}
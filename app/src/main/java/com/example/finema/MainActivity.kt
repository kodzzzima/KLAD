package com.example.finema

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.finema.databinding.ActivityMainBinding
import com.google.android.material.appbar.MaterialToolbar

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.topAppBar.setNavigationOnClickListener {
            binding.drawerLayout.open()
        }
    }
}
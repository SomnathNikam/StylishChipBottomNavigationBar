package com.example.stylishnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import com.example.stylishnavigation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        setupbar()

    }

    private fun setupbar() {
        binding.chipnav.setOnItemSelectedListener {
            when(it){
                R.id.message -> binding.textView.text="Chat"
                R.id.person -> binding.textView.text="person"
                R.id.nearMe ->{ binding.textView.text="nearme"
                binding.chipnav.showBadge(R.id.nearMe)
                }
                R.id.settings -> binding.textView.text="Settins"

            }
        }
    }
}
package com.example.stylishnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

import androidx.appcompat.app.AppCompatDelegate
import com.example.stylishnavigation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        setupNavbar()

    }

    private  fun setupNavbar() {
        binding.chipnav.setOnItemSelectedListener {
            when(it){
                R.id.message -> {
                    binding.textView.text = "Chat"
                    Toast.makeText(this,"Chat",Toast.LENGTH_LONG).show()
                }
                R.id.person -> {
                    binding.textView.text = "Person"
                    Toast.makeText(this,"Person",Toast.LENGTH_LONG).show()
                }
                R.id.nearMe ->{ binding.textView.text="Near me"
                binding.chipnav.showBadge(R.id.nearMe)
                    Toast.makeText(this,"Near Me",Toast.LENGTH_LONG).show()
                }
                R.id.settings -> {
                    binding.textView.text="Settings"
                    binding.chipnav.dismissBadge(R.id.settings)
                    Toast.makeText(this,"Settings",Toast.LENGTH_LONG).show()
                }

            }
        }
    }
}
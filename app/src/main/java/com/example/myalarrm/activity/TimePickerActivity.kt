package com.example.myalarrm.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myalarrm.databinding.ActivityTimePickerBinding

class TimePickerActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTimePickerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTimePickerBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }


}
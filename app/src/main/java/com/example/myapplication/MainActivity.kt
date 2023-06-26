package com.example.myapplication

import android.app.Activity
import android.media.AudioPlaybackCaptureConfiguration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.databinding.ActivitySecondBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding//main
    private lateinit var binding2: ActivitySecondBinding//second

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /*binding2 = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding2.root)*/

    }

}



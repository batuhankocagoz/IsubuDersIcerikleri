package com.example.isubuderscerikleri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.isubuderscerikleri.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        binding.btnSinif1.setOnClickListener(View.OnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        })

        binding.btnSinif2.setOnClickListener(View.OnClickListener {
            val intent = Intent(this,MainActivity3::class.java)
            startActivity(intent)
        })

        binding.btnSinif3.setOnClickListener(View.OnClickListener {
            val intent = Intent(this,MainActivity4::class.java)
            startActivity(intent)
        })

        binding.btnSinif4.setOnClickListener(View.OnClickListener {
            val intent = Intent(this,MainActivity5::class.java)
            startActivity(intent)
        })
    }
}
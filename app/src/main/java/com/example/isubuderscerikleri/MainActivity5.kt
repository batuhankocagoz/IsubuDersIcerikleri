package com.example.isubuderscerikleri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.isubuderscerikleri.databinding.ActivityMain2Binding
import com.example.isubuderscerikleri.databinding.ActivityMain5Binding

class MainActivity5 : AppCompatActivity() {
    private lateinit var binding: ActivityMain5Binding
    private lateinit var lessonList : ArrayList<Lessons>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain5Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}
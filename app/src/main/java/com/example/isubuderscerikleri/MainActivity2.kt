package com.example.isubuderscerikleri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.isubuderscerikleri.databinding.ActivityMain2Binding
import com.example.isubuderscerikleri.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    private lateinit var lessonList : ArrayList<Lessons>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        lessonList = ArrayList<Lessons>()

        val blg0 = Lessons("1.Sınıf / Güz Dönemi","")
        val blg1 = Lessons("Algoritma ve Programlamaya Giriş","BLG-101")
        val blg2 = Lessons("Bilgisayar Mühendisliğine Giriş","BLG-103")
        val blg3 = Lessons("Bilişim Teknolojilerinin Temelleri","BLG-105")
        val blg4 = Lessons("Fizik I","FIZ-145")
        val blg5 = Lessons("Fizik Laboratuvarı I","FIZ-147")
        val blg6 = Lessons("Kariyer Planlama","KRY-100")
        val blg7 = Lessons("Kalkülüs I","MAT-151")
        val blg8 = Lessons("Lineer Cebir","MAT-160")
        val blg9 = Lessons("İngilizce I","ING-101")
        val blg10 = Lessons("Türk Dili I","TUR-170")

        val blg00 = Lessons("1.Sınıf / Bahar Dönemi","")
        val blg11 = Lessons("Veri Yapıları ","BLG-102")
        val blg12 = Lessons("Temel Elektrik ve Elektronik ","BLG-104")
        val blg13 = Lessons("Fizik II ","FIZ-146")
        val blg14 = Lessons("Fizik Laboratuvarı II ","FIZ-148")
        val blg15 = Lessons("Kalkülüs II","MAT-151")
        val blg16 = Lessons("Ayrık Matematik","MAT-161")
        val blg17 = Lessons("İngilizce II","ING-102")
        val blg18 = Lessons("Türk Dili II","TUR-270")
        val blg19 = Lessons("Web Teknolojilerine Giriş","BLG-106")

        lessonList.add(blg0)
        lessonList.add(blg1)
        lessonList.add(blg2)
        lessonList.add(blg3)
        lessonList.add(blg4)
        lessonList.add(blg5)
        lessonList.add(blg6)
        lessonList.add(blg7)
        lessonList.add(blg8)
        lessonList.add(blg9)
        lessonList.add(blg10)

        lessonList.add(blg00)
        lessonList.add(blg11)
        lessonList.add(blg12)
        lessonList.add(blg13)
        lessonList.add(blg14)
        lessonList.add(blg15)
        lessonList.add(blg16)
        lessonList.add(blg17)
        lessonList.add(blg18)
        lessonList.add(blg19)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val lessonsAdapter = LessonsAdapter(lessonList)
        binding.recyclerView.adapter = lessonsAdapter
    }
}
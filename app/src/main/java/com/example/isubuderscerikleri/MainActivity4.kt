package com.example.isubuderscerikleri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.isubuderscerikleri.databinding.ActivityMain2Binding
import com.example.isubuderscerikleri.databinding.ActivityMain4Binding

class MainActivity4 : AppCompatActivity() {
    private lateinit var binding: ActivityMain4Binding
    private lateinit var lesson3List : ArrayList<Lessons>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain4Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        lesson3List = ArrayList<Lessons>()

        val blg0 = Lessons("3.Sınıf / Güz Dönemi","")
        val blg1 = Lessons("Mikroişlemciler ve Assembly Programlama","BLG-301")
        val blg2 = Lessons("İşletim Sistemleri","BLG-303")
        val blg3 = Lessons("Web Teknolojileri ve Programlama","BLG-305")
        val blg4 = Lessons("Yapay Zeka Sistemleri","BLG-307")
        val blg5 = Lessons("Mobil Programlama","BLG-323")
        val blg6 = Lessons("Bilgisayar Mühendisliğinde Proje Yönetimi","BLG-331")
        val blg7 = Lessons("Bilişim Hukuku","BLG-345")

        val blg00 = Lessons("3.Sınıf / Bahar Dönemi","")
        val blg11 = Lessons("Bilgisayar Mimarisi ve Organizasyonu","BLG-302")
        val blg12 = Lessons("Biçimsel Diller ve Otomata","BLG-304")
        val blg13 = Lessons("Bilgisayar Ağları","BLG-306")
        val blg14 = Lessons("Yazılım Mühendisliği","BLG-308")
        val blg15 = Lessons("Bilgisayar Mühendisliğinde Proje Uygulamaları","BLG-340")
        val blg16 = Lessons("Bilgi Güvenliği ve Kriptografi","BLG-324")
        val blg17 = Lessons("Yazılım Tasarım ve Mimarisi","BLG-330")

        lesson3List.add(blg0)
        lesson3List.add(blg1)
        lesson3List.add(blg2)
        lesson3List.add(blg3)
        lesson3List.add(blg4)
        lesson3List.add(blg5)
        lesson3List.add(blg6)
        lesson3List.add(blg7)


        lesson3List.add(blg00)
        lesson3List.add(blg11)
        lesson3List.add(blg12)
        lesson3List.add(blg13)
        lesson3List.add(blg14)
        lesson3List.add(blg15)
        lesson3List.add(blg16)
        lesson3List.add(blg17)


        binding.recyclerView3.layoutManager = LinearLayoutManager(this)
        val lessonsAdapter = LessonsAdapter(lesson3List)
        binding.recyclerView3.adapter = lessonsAdapter
    }
}
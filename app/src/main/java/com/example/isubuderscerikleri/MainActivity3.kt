package com.example.isubuderscerikleri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.isubuderscerikleri.databinding.ActivityMain2Binding
import com.example.isubuderscerikleri.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    private lateinit var binding: ActivityMain3Binding
    private lateinit var lesson2List : ArrayList<Lessons>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        lesson2List = ArrayList<Lessons>()

        val blg0 = Lessons("2.Sınıf / Güz Dönemi","")
        val blg1 = Lessons("Nesne Tabanlı Programlama","BLG-201")
        val blg2 = Lessons("Veritabanı Yönetim Sistemleri","BLG-203")
        val blg3 = Lessons("Bilgisayar Programlama I","BLG-205")
        val blg4 = Lessons("Sayısal Elektronik","FIZ-145")
        val blg5 = Lessons("Akademik İngilizce I","BLG-209")
        val blg6 = Lessons("Diferansiyel Denklemler","MAT-157")
        val blg7 = Lessons("Üniversite Ortak Seçmeli I","UOS-801")
        val blg8 = Lessons("Atatürk İlkeleri ve İnkılap Tarihi I","ATA-160")
        val blg9 = Lessons("Görsel Tasarım İlkeleri","BLG-211")


        val blg00 = Lessons("2.Sınıf / Bahar Dönemi","")
        val blg11 = Lessons("Algoritmalar","BLG-204")
        val blg12 = Lessons("Olasılık ve İstatistik","BLG-206")
        val blg13 = Lessons("Bilgisayar Programlama II","BLG-208")
        val blg14 = Lessons("Sayısal Sistem Tasarımı","BLG-224")
        val blg15 = Lessons("Sayısal Çözümleme","MAT-162")
        val blg16 = Lessons("Üniversite Ortak Seçmeli II","UOS-802")
        val blg17 = Lessons("Atatürk İlkeleri ve İnkılap Tarihi II","ATA-260")
        val blg18 = Lessons("Algılama ve Veri Toplama","BLG-212")
        val blg19 = Lessons("Seçmeli Dil(Akademik İngilizce II - Almanca I)","BLG-212")

        lesson2List.add(blg0)
        lesson2List.add(blg1)
        lesson2List.add(blg2)
        lesson2List.add(blg3)
        lesson2List.add(blg4)
        lesson2List.add(blg5)
        lesson2List.add(blg6)
        lesson2List.add(blg7)
        lesson2List.add(blg8)
        lesson2List.add(blg9)

        lesson2List.add(blg00)
        lesson2List.add(blg11)
        lesson2List.add(blg12)
        lesson2List.add(blg13)
        lesson2List.add(blg14)
        lesson2List.add(blg15)
        lesson2List.add(blg16)
        lesson2List.add(blg17)
        lesson2List.add(blg18)
        lesson2List.add(blg19)

        binding.recyclerView2.layoutManager = LinearLayoutManager(this)
        val lessonsAdapter = LessonsAdapter(lesson2List)
        binding.recyclerView2.adapter = lessonsAdapter







    }
}
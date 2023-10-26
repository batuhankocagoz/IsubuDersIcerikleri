package com.example.isubuderscerikleri

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.isubuderscerikleri.databinding.RecyclerItemBinding

class LessonsAdapter(val lessonList : ArrayList<Lessons>) : RecyclerView.Adapter<LessonsAdapter.LessonsHolder>() {
    class LessonsHolder(val binding: RecyclerItemBinding) : RecyclerView.ViewHolder(binding.root) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LessonsHolder {
        val binding = RecyclerItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return LessonsHolder(binding)
    }

    override fun getItemCount(): Int {
        return lessonList.size

    }

    override fun onBindViewHolder(holder: LessonsHolder, position: Int) {
        holder.binding.recyclerTextView.text = lessonList.get(position).name
        holder.binding.recyclerCodeView.text = lessonList.get(position).lessCode
    }

}
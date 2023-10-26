package com.example.isubuderscerikleri

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.isubuderscerikleri.databinding.RecyclerItemBinding

class Lessons2Adapter(val lesson2List : ArrayList<Lessons>) : RecyclerView.Adapter<LessonsAdapter.LessonsHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): LessonsAdapter.LessonsHolder {
        val binding = RecyclerItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return LessonsAdapter.LessonsHolder(binding)
    }

    override fun getItemCount(): Int {
        return lesson2List.size
    }

    override fun onBindViewHolder(holder: LessonsAdapter.LessonsHolder, position: Int) {
        holder.binding.recyclerTextView.text = lesson2List.get(position).name
        holder.binding.recyclerCodeView.text = lesson2List.get(position).lessCode
    }
}
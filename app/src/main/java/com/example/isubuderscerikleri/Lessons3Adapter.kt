package com.example.isubuderscerikleri

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.isubuderscerikleri.databinding.RecyclerItemBinding

class Lessons3Adapter(val lesson3List : ArrayList<Lessons>) : RecyclerView.Adapter<LessonsAdapter.LessonsHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): LessonsAdapter.LessonsHolder {
        val binding = RecyclerItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return LessonsAdapter.LessonsHolder(binding)
    }

    override fun getItemCount(): Int {
        return lesson3List.size
    }

    override fun onBindViewHolder(holder: LessonsAdapter.LessonsHolder, position: Int) {
        holder.binding.recyclerTextView.text = lesson3List.get(position).name
        holder.binding.recyclerCodeView.text = lesson3List.get(position).lessCode
    }
}
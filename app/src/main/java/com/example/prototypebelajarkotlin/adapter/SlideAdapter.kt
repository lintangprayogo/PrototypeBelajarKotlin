package com.example.prototypebelajarkotlin.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.prototypebelajarkotlin.R
import com.example.prototypebelajarkotlin.databinding.MainSlideItemBinding

class SlideAdapter(private val list:List<SlideItem>):RecyclerView.Adapter<SlideAdapter.SlideViewHolder>() {

    inner  class SlideViewHolder(private val binding: MainSlideItemBinding):RecyclerView.ViewHolder(binding.root){
       fun bind(item: SlideItem){
            binding.imageSlide.setImageResource(item.image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SlideViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val  binding = DataBindingUtil.inflate<MainSlideItemBinding>( layoutInflater,
            R.layout.main_slide_item, parent, false)
       return SlideViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SlideViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }
}
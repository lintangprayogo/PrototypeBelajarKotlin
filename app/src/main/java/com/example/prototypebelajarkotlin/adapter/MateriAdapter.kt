package com.example.prototypebelajarkotlin.adapter


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.prototypebelajarkotlin.R
import com.example.prototypebelajarkotlin.databinding.MateriItemLayoutBinding
import com.example.prototypebelajarkotlin.model.Materi
import com.lintangprayogo.aplikasisidang.core.base.BaseRecyclerViewAdapter
import com.lintangprayogo.aplikasisidang.core.base.BaseViewHolder

class MateriAdapter:BaseRecyclerViewAdapter<Materi,MateriItemLayoutBinding,MateriAdapter.MateriHolder>() {
    inner class MateriHolder( val binding: MateriItemLayoutBinding):BaseViewHolder<Materi,MateriItemLayoutBinding>(binding){
        override fun bindData(data: Materi) {
            super.bindData(data)
            binding.materi=data
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MateriHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val  binding = DataBindingUtil.inflate<MateriItemLayoutBinding>( layoutInflater,
            R.layout.materi_item_layout, parent, false)
    return  MateriHolder(binding)
    }
}
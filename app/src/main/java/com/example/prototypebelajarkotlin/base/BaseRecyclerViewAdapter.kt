package com.lintangprayogo.aplikasisidang.core.base

import android.content.Context
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView


abstract class BaseRecyclerViewAdapter<T, Binding : ViewDataBinding, Holder : BaseViewHolder<T, Binding>> :
    RecyclerView.Adapter<Holder>() {
    private val dataList: MutableList<T> = mutableListOf()
    protected lateinit var mContext: Context
    protected  var mListener: ((T) -> Unit)?=null


    fun setListener(listner: (T) -> Unit) {
        mListener = listner
    }


    fun addData(data: List<T>) {
        destroyData()
        dataList.addAll(data)
        notifyDataSetChanged()
    }

    fun destroyData() {
        dataList.removeAll(dataList)

    }


    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bindData(dataList[position])
        if(mListener!=null)
        holder.itemView.setOnClickListener { mListener!!(dataList[position]) }
    }
}
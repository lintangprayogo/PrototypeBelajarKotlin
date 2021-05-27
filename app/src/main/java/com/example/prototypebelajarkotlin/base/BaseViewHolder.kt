package com.lintangprayogo.aplikasisidang.core.base


import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView


abstract class BaseViewHolder<T, Binding : ViewDataBinding>(protected val bind: Binding) :
    RecyclerView.ViewHolder(bind.root) {

    open fun bindData(data: T) {}
}
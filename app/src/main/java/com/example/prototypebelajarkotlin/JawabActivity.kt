package com.example.prototypebelajarkotlin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import com.example.prototypebelajarkotlin.base.BaseActivity
import com.example.prototypebelajarkotlin.databinding.ActivityJawabBinding
import com.example.prototypebelajarkotlin.model.Chat
import com.frogobox.recycler.core.FrogoHolder
import com.frogobox.recycler.core.FrogoRecyclerViewListener
import com.frogobox.recycler.core.FrogoRvConstant
import com.frogobox.recycler.core.IFrogoViewHolder

class JawabActivity : BaseActivity<ActivityJawabBinding>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityJawabBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)
        setupDetailActivity("Jawab")
        setupFrogoRecyclerView()
    }

    private fun firstCallback(): IFrogoViewHolder<Chat> {
        return object : IFrogoViewHolder<Chat> {
            override fun setupInitComponent(view: View, data: Chat) {
                // Init component content item recyclerview
                view.findViewById<TextView>(R.id.tv_name).text = data.name
                view.findViewById<TextView>(R.id.tv_message).text = data.chat
            }
        }
    }

    private fun secondCallback(): IFrogoViewHolder<Chat> {
        return object : IFrogoViewHolder<Chat>{
            override fun setupInitComponent(view: View, data: Chat) {
                // Init component content item recyclerview
                view.findViewById<TextView>(R.id.tv_name).text = data.name
                view.findViewById<TextView>(R.id.tv_message).text = data.chat            }
        }
    }

    private fun firstListenerType(): FrogoRecyclerViewListener<Chat>{
        return object : FrogoRecyclerViewListener<Chat>{
            override fun onItemClicked(data: Chat) {
                showToast(data.name + " First")
            }

            override fun onItemLongClicked(data: Chat) {
                showToast("LAYOUT TYPE 1")
            }
        }
    }

    private fun secondListenerType() : FrogoRecyclerViewListener<Chat> {
        return object : FrogoRecyclerViewListener<Chat>{
            override fun onItemClicked(data: Chat) {
                showToast(data.name + " Second")
            }

            override fun onItemLongClicked(data: Chat) {
                showToast("LAYOUT TYPE 2")
            }
        }
    }

    private fun data() : MutableList<FrogoHolder<Chat>> {
        val data =  mutableListOf<FrogoHolder<Chat>>()
        data.add(FrogoHolder(Chat("Me", "Chat 1"), R.layout.item_chat_me, FrogoRvConstant.OPTION_HOLDER_FIRST, firstCallback(), firstListenerType()))
        data.add(FrogoHolder(Chat("Lintang", "Chat 2"), R.layout.item_chat_other, FrogoRvConstant.OPTION_HOLDER_SECOND, secondCallback(), secondListenerType()))
        data.add(FrogoHolder(Chat("Lintang", "Chat 2"), R.layout.item_chat_other, FrogoRvConstant.OPTION_HOLDER_SECOND, secondCallback(), secondListenerType()))
        data.add(FrogoHolder(Chat("Lintang", "Chat 2"), R.layout.item_chat_other, FrogoRvConstant.OPTION_HOLDER_SECOND, secondCallback(), secondListenerType()))
        data.add(FrogoHolder(Chat("Lintang", "Chat 2"), R.layout.item_chat_other, FrogoRvConstant.OPTION_HOLDER_SECOND, secondCallback(), secondListenerType()))
        data.add(FrogoHolder(Chat("Me", "Chat 1"), R.layout.item_chat_me, FrogoRvConstant.OPTION_HOLDER_FIRST, firstCallback(), firstListenerType()))
        data.add(FrogoHolder(Chat("Me", "Chat 1"), R.layout.item_chat_me, FrogoRvConstant.OPTION_HOLDER_FIRST, firstCallback(), firstListenerType()))
        data.add(FrogoHolder(Chat("Lintang", "Chat 2"), R.layout.item_chat_other, FrogoRvConstant.OPTION_HOLDER_SECOND, secondCallback(), secondListenerType()))
        data.add(FrogoHolder(Chat("Lintang", "Chat 2"), R.layout.item_chat_other, FrogoRvConstant.OPTION_HOLDER_SECOND, secondCallback(), secondListenerType()))
        data.add(FrogoHolder(Chat("Me", "Chat 1"), R.layout.item_chat_me, FrogoRvConstant.OPTION_HOLDER_FIRST, firstCallback(), firstListenerType()))
        return data
    }

    private fun setupFrogoRecyclerView() {
        binding.frogoRV
            .injector<Chat>()
            .addDataFH(data())
            .createLayoutLinearVertical(false)
            .build()
    }


}
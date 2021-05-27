package com.example.prototypebelajarkotlin

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.prototypebelajarkotlin.adapter.SlideAdapter
import com.example.prototypebelajarkotlin.adapter.SlideItem
import com.example.prototypebelajarkotlin.base.BaseActivity
import com.example.prototypebelajarkotlin.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {
    private lateinit var adapter: SlideAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val list = mutableListOf(
            SlideItem(R.drawable.frame_kotlin),
            SlideItem(R.drawable.frame_kotlin),
            SlideItem(R.drawable.frame_kotlin),
        )
        adapter= SlideAdapter(list)
        binding.mainMenuRv.adapter=adapter
        binding.mainMenuRv.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, true)
           binding.materi.setOnClickListener {
               baseStartActivity<MateriActivity>()
           }
        binding.forum.setOnClickListener {
            baseStartActivity<ForumActivity>()
        }
       binding.appBar.back.visibility= View.GONE
    }


}
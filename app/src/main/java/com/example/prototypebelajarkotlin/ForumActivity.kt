package com.example.prototypebelajarkotlin

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import com.example.prototypebelajarkotlin.base.BaseActivity
import com.example.prototypebelajarkotlin.databinding.ActivityForumBinding

class ForumActivity : BaseActivity<ActivityForumBinding>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityForumBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)
        setupDetailActivity("Forum")
        setupUI()
    }

    private fun setupUI() {
        binding.apply {
            ivJawab.setOnClickListener {
                baseStartActivity<JawabActivity>()
            }
            tvJawab.setOnClickListener {
                baseStartActivity<JawabActivity>()
            }
            ivTanya.setOnClickListener {
                baseStartActivity<TanyaActivity>()
            }
            tvTanya.setOnClickListener {
                baseStartActivity<TanyaActivity>()
            }
        }
    }

}
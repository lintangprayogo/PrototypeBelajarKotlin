package com.example.prototypebelajarkotlin

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import com.example.prototypebelajarkotlin.core.BaseActivity
import com.example.prototypebelajarkotlin.databinding.ActivityForumBinding

class ForumActivity : BaseActivity() {

    private lateinit var binding: ActivityForumBinding

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
                startActivity(Intent(this@ForumActivity, JawabActivity::class.java))
            }
            tvJawab.setOnClickListener {
                startActivity(Intent(this@ForumActivity, JawabActivity::class.java))
            }
            ivTanya.setOnClickListener {
                startActivity(Intent(this@ForumActivity, JawabActivity::class.java))
            }
            tvTanya.setOnClickListener {
                startActivity(Intent(this@ForumActivity, JawabActivity::class.java))
            }
        }
    }

}
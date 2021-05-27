package com.example.prototypebelajarkotlin

import android.os.Bundle
import android.view.LayoutInflater
import com.example.prototypebelajarkotlin.core.BaseActivity
import com.example.prototypebelajarkotlin.databinding.ActivityJawabBinding

class JawabActivity : BaseActivity() {

    private lateinit var binding: ActivityJawabBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityJawabBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)
        setupDetailActivity("Jawab")
    }
}
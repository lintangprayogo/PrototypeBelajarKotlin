package com.example.prototypebelajarkotlin

import android.os.Bundle
import android.view.LayoutInflater
import com.example.prototypebelajarkotlin.core.BaseActivity
import com.example.prototypebelajarkotlin.databinding.ActivityTanyaBinding

class TanyaActivity : BaseActivity() {

    private lateinit var binding: ActivityTanyaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTanyaBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)
        setupDetailActivity("Tanya")
    }
}
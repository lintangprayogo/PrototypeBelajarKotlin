package com.example.prototypebelajarkotlin

import android.os.Bundle
import android.view.LayoutInflater
import com.example.prototypebelajarkotlin.core.BaseActivity
import com.example.prototypebelajarkotlin.databinding.ActivityQuizBinding

class QuizActivity : BaseActivity() {

    private lateinit var binding: ActivityQuizBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)
        setupDetailActivity("Quiz")
    }

}
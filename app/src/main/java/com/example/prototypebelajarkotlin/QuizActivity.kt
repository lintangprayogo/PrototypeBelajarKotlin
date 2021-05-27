package com.example.prototypebelajarkotlin

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.prototypebelajarkotlin.base.BaseActivity
import com.example.prototypebelajarkotlin.databinding.ActivityQuizBinding

class QuizActivity : BaseActivity<ActivityQuizBinding>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_quiz)
        setupDetailActivity("Quiz")
    }

}
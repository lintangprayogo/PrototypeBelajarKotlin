package com.example.prototypebelajarkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.prototypebelajarkotlin.databinding.ActivityMateriDetailBinding
import com.example.prototypebelajarkotlin.model.Materi
import com.lintangprayogo.aplikasisidang.core.base.BaseActivity

class MateriDetailActivity : BaseActivity<ActivityMateriDetailBinding>() {
    private lateinit var materi:Materi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        materi=getExtraData("materi")
        binding=DataBindingUtil.setContentView(this,R.layout.activity_materi_detail)
        binding.materi=materi
        binding.appBar.title.text=getString(R.string.materi_detail)
        binding.appBar.back.setOnClickListener {
            finish()
        }
    }
}
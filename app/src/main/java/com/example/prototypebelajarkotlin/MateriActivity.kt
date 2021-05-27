package com.example.prototypebelajarkotlin

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.prototypebelajarkotlin.adapter.MateriAdapter
import com.example.prototypebelajarkotlin.databinding.ActivityMateriBinding
import com.example.prototypebelajarkotlin.model.Materi
import com.lintangprayogo.aplikasisidang.core.base.BaseActivity

class MateriActivity : BaseActivity<ActivityMateriBinding>() {
    private lateinit var adapter:MateriAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_materi)
        val list =listOf(
            Materi(
                getString(R.string.materi_1),
                getString(R.string.dummy_text),
                "https://cdn.pixabay.com/photo/2018/11/14/12/04/small-3815058_960_720.jpg",
                getString(R.string.dummy_text_2),
            ),
            Materi(
                getString(R.string.materi_1),
                getString(R.string.dummy_text),
                "https://cdn.pixabay.com/photo/2020/08/10/23/28/character-5478922_960_720.png",
                getString(R.string.dummy_text_2),
            ),
            Materi(
                getString(R.string.materi_1),
                getString(R.string.dummy_text),
                "https://cdn.pixabay.com/photo/2020/04/25/09/52/onepiece-5090120_960_720.jpg",
                getString(R.string.dummy_text_2),
            ),
            Materi(
                getString(R.string.materi_1),
                getString(R.string.dummy_text),
                "https://cdn.pixabay.com/photo/2018/11/14/12/04/small-3815058_960_720.jpg",
                getString(R.string.dummy_text_2),
            ),
            Materi(
                getString(R.string.materi_1),
                getString(R.string.dummy_text),
                "https://cdn.pixabay.com/photo/2020/08/10/23/28/character-5478922_960_720.png",
                getString(R.string.dummy_text_2),
            ),
            Materi(
                getString(R.string.materi_1),
                getString(R.string.dummy_text),
                "https://cdn.pixabay.com/photo/2020/04/25/09/52/onepiece-5090120_960_720.jpg",
                getString(R.string.dummy_text_2),
            ),
            Materi(
                getString(R.string.materi_1),
                getString(R.string.dummy_text),
                "https://cdn.pixabay.com/photo/2018/11/14/12/04/small-3815058_960_720.jpg",
                getString(R.string.dummy_text_2),
            ),
            Materi(
                getString(R.string.materi_1),
                getString(R.string.dummy_text),
                "https://cdn.pixabay.com/photo/2020/08/10/23/28/character-5478922_960_720.png",
                getString(R.string.dummy_text_2),
            ),
            Materi(
                getString(R.string.materi_1),
                getString(R.string.dummy_text),
                "https://cdn.pixabay.com/photo/2020/04/25/09/52/onepiece-5090120_960_720.jpg",
                getString(R.string.dummy_text_2),
            )
        )
        binding.appBar.back.setOnClickListener {
            finish()
        }
        adapter= MateriAdapter()
        adapter.addData(list)
        adapter.setListener {  baseStartActivity<MateriDetailActivity,Materi>("materi",it) }
        binding.materiRv.layoutManager=LinearLayoutManager(this)
        binding.materiRv.adapter=adapter
        binding.appBar.title.text=getString(R.string.materi)
    }
}
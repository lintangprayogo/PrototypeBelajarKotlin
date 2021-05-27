package com.lintangprayogo.aplikasisidang.core.base


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.gson.Gson



abstract class BaseFragment : Fragment() {




    protected inline fun <reified ClassActivity, Model> baseStartActivity(
        extraKey: String,
        data: Model
    ) {
        val intent = Intent(context, ClassActivity::class.java)
        val extraData = Gson().toJson(data)
        intent.putExtra(extraKey, extraData)
        this.startActivity(intent)
    }


    protected inline fun <reified Model> getSession(key: String): Model? {
        val sharedPreferences = requireActivity().getSharedPreferences(
            "SIDANG_APP",
            AppCompatActivity.MODE_PRIVATE
        )
        val stringData = sharedPreferences.getString(key, null)
        if (stringData.isNullOrEmpty()) {
            return null
        } else {
            return Gson().fromJson(stringData, Model::class.java)
        }
    }


}
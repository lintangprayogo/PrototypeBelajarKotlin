@file:Suppress("DEPRECATION")

package com.example.prototypebelajarkotlin.base

import android.app.ProgressDialog
import android.content.Intent
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding
import com.google.gson.Gson



abstract class BaseActivity<T : ViewBinding> : AppCompatActivity() {

    protected lateinit var binding: T
    protected lateinit var progressDialog: ProgressDialog

    protected fun setupDetailActivity(titleApps: String) {
        supportActionBar?.apply {
            elevation = 0f
            title = titleApps
            setDisplayHomeAsUpEnabled(true)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                finish()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    protected inline fun <reified Model> getExtraData(key: String): Model {
        val extraIntent = intent.getStringExtra(key)

        return Gson().fromJson(extraIntent!!, Model::class.java)
    }

    protected inline fun <reified ClassActivity, Model> baseStartActivity(
        extraKey: String,
        data: Model
    ) {
        val intent = Intent(this, ClassActivity::class.java)
        val extraData = Gson().toJson(data)
        intent.putExtra(extraKey, extraData)
        this.startActivity(intent)
    }


    protected inline fun <reified ClassActivity> baseStartActivity() {
        val intent = Intent(this, ClassActivity::class.java)
        startActivity(intent)
    }

    protected fun <Model> makeSession(
        key: String,
        data: Model
    ) {
        val stringData = Gson().toJson(data)
        val sharedPreferences = this.getSharedPreferences("SIDANG_APP", MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.putString(key, stringData)
        editor.apply()
        editor.commit()
    }

    protected inline fun <reified Model> getSession(key: String): Model? {
        val sharedPreferences = this.getSharedPreferences("SIDANG_APP", MODE_PRIVATE)
        val stringData = sharedPreferences.getString(key, null)
        if (stringData.isNullOrEmpty()) {
            return null
        } else {
            return Gson().fromJson(stringData, Model::class.java)
        }
    }

    protected fun removeSession() {
        val sharedPreferences = getSharedPreferences("SIDANG_APP", MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.clear()
        editor.apply()
    }

    protected fun showToast(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }


}
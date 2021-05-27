package com.example.prototypebelajarkotlin.util

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.example.prototypebelajarkotlin.R
import com.squareup.picasso.Picasso


object DataBindingAdapater {
    @JvmStatic
    @BindingAdapter("urlImage")
    fun setImage(view: ImageView, imageUrl: String?) {
        if (imageUrl != null) {
            Picasso.get()
                .load(imageUrl)
                .fit().
                placeholder(R.drawable.frame_kotlin)
                .error(R.drawable.frame_kotlin)
                .centerCrop()
                .into(view)
        } else {
            view.setImageBitmap(null)
        }
    }


}
package com.ui.food.ui.viewholder

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ui.food.R
import com.ui.food.model.FoodModel

class FoodViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

    val foodImageView = view.findViewById<ImageView>(R.id.ivFood)
    fun onBind(model: FoodModel) {
        Glide.with(view)
            .load(model.foodImage)
            .into(foodImageView)
    }
}
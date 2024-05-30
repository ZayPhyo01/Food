package com.ui.food.ui.viewholder

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ui.food.R
import com.ui.food.databinding.ItemViewFoodBinding
import com.ui.food.model.FoodModel

class FoodViewHolder(private val binding: ItemViewFoodBinding) :
    RecyclerView.ViewHolder(binding.root) {

    private val foodImageView = binding.ivFood
    fun onBind(model: FoodModel) {
        Glide.with(binding.root)
            .load(model.foodImage)
            .into(foodImageView)
    }
}
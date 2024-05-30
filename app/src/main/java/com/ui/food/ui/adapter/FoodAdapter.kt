package com.ui.food.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ui.food.R
import com.ui.food.databinding.ItemViewFoodBinding
import com.ui.food.model.FoodModel
import com.ui.food.ui.viewholder.FoodViewHolder

class FoodAdapter : RecyclerView.Adapter<FoodViewHolder>() {

    private var foodList: List<FoodModel> = emptyList()

    fun updateList(list: List<FoodModel>) {
        foodList = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        // view inflation
        // viewholder create
        val binding = ItemViewFoodBinding.inflate(
            LayoutInflater.from(parent.context)
        )
        return FoodViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return foodList.size
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        holder.onBind(
            foodList[position]
        )
    }
}
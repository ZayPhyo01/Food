package com.ui.food.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ui.food.R
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
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_view_food, parent, false)
        return FoodViewHolder(view)
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
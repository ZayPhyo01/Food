package com.ui.food.data.mapper

import com.ui.food.data.model.FoodResponse
import com.ui.food.model.FoodModel

fun List<FoodResponse>.toModels(): List<FoodModel> = map {
    FoodModel(foodImage = it.image)
}
package com.ui.food.data.repository

import com.ui.food.data.datasource.FoodRemoteDataSource
import com.ui.food.model.FoodModel

class FoodRepository(
    private val foodRemoteDataSource: FoodRemoteDataSource
) {

    fun getFoodList(): List<FoodModel> = foodRemoteDataSource.getFoodList()
}
package com.ui.food.data.datasource

import com.ui.food.data.mapper.toModels
import com.ui.food.data.service.FoodService

class FoodRemoteDataSource(
    private val foodService: FoodService
) {
    fun getFoodList() = foodService.getFoodList().toModels()

}
package com.ui.food.ui.viewmodel

import com.ui.food.data.repository.FoodRepository

class FoodViewModel(
    private val foodRepository: FoodRepository
) {
    fun getFoodList() = foodRepository.getFoodList()
}
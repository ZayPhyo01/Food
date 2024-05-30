package com.ui.food.data.service

import com.ui.food.data.model.FoodResponse

class FoodService {
    fun getFoodList() = listOf(
        FoodResponse(
            id = "1",
            image = "https://www.foodiesfeed.com/wp-content/uploads/2023/06/burger-with-melted-cheese.jpg"
        ),
        FoodResponse(
            id = "2",
            image = "https://t3.ftcdn.net/jpg/02/52/38/80/360_F_252388016_KjPnB9vglSCuUJAumCDNbmMzGdzPAucK.jpg",
        ),
        FoodResponse(
            id = "3",
            image = "https://images.unsplash.com/photo-1551024601-bec78aea704b?q=80&w=1000&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8ZGVsaWNpb3VzJTIwZm9vZHxlbnwwfHwwfHx8MA%3D%3D"
        ),
        FoodResponse(
            id = "4",
            image = "https://media.cnn.com/api/v1/images/stellar/prod/140430115517-06-comfort-foods.jpg?q=w_1110,c_fill"
        )
    )
}
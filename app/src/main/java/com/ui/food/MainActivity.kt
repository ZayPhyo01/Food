package com.ui.food

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import com.ui.food.model.FoodModel
import com.ui.food.ui.adapter.FoodAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val rvFoodList = findViewById<RecyclerView>(R.id.rvFood)
        val adapter = FoodAdapter()
        rvFoodList.adapter = adapter
        adapter.updateList(
            list = listOf(
                FoodModel("https://www.foodiesfeed.com/wp-content/uploads/2023/06/burger-with-melted-cheese.jpg"),
                FoodModel("https://t3.ftcdn.net/jpg/02/52/38/80/360_F_252388016_KjPnB9vglSCuUJAumCDNbmMzGdzPAucK.jpg"),
                FoodModel("https://images.unsplash.com/photo-1551024601-bec78aea704b?q=80&w=1000&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8ZGVsaWNpb3VzJTIwZm9vZHxlbnwwfHwwfHx8MA%3D%3D"),
                FoodModel("https://media.cnn.com/api/v1/images/stellar/prod/140430115517-06-comfort-foods.jpg?q=w_1110,c_fill")
            )
        )

    }
}
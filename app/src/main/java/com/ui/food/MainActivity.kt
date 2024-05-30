package com.ui.food

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import com.ui.food.data.datasource.FoodRemoteDataSource
import com.ui.food.data.repository.FoodRepository
import com.ui.food.data.service.FoodService
import com.ui.food.databinding.ActivityMainBinding
import com.ui.food.model.FoodModel
import com.ui.food.ui.adapter.FoodAdapter
import com.ui.food.ui.viewmodel.FoodViewModel


class MainActivity : AppCompatActivity() {

    private val foodService = FoodService()
    private val foodRemoteDataSource = FoodRemoteDataSource(foodService)
    private val foodRepository = FoodRepository(foodRemoteDataSource)
    private lateinit var binding: ActivityMainBinding


    private val viewModel = FoodViewModel(
        foodRepository
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        //obj create
        binding = ActivityMainBinding.inflate(layoutInflater)
        // connect
        setContentView(binding.root)

        // object create
        // connect
        // access

        val rvFoodList = binding.rvFood

        val adapter = FoodAdapter()
        rvFoodList.adapter = adapter
        adapter.updateList(
            viewModel.getFoodList()
        )

    }
}
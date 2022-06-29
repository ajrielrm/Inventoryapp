package com.example.inventoryapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.inventoryapp.databinding.ActivityDetailBinding
import com.example.inventoryapp.databinding.ActivityStockoutBinding

class StockoutActivity : AppCompatActivity() {

    private var layoutManager : RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<ItemAdapter.ViewHolder>? = null
    private lateinit var binding: ActivityStockoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stockout)
        binding = ActivityStockoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        window.statusBarColor = ContextCompat.getColor(this, R.color.primary)

        layoutManager = LinearLayoutManager(this)

        binding.rvSearch.layoutManager = layoutManager

        adapter = ItemAdapter()
        binding.rvSearch.adapter =adapter

    }

}
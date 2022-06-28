package com.example.inventoryapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.inventoryapp.databinding.ActivityMoveBinding

class MoveActivity : AppCompatActivity(), AdapterView.OnItemClickListener {

    private lateinit var binding: ActivityMoveBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMoveBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listWarehouse = resources.getStringArray(R.array.warehouse_items)
        val adapter = ArrayAdapter(
            this, R.layout.list_item_move, listWarehouse

        )

        with(binding.autoCompleteTextView){
            setAdapter(adapter)
            onItemClickListener = this@MoveActivity

        }

        with(binding.autoCompleteTextViewMove){
            setAdapter(adapter)
            onItemClickListener = this@MoveActivity
        }

    }

    override fun onItemClick(parent: AdapterView<*>?,view: View?, position: Int, id: Long) {
        val item = parent?.getItemAtPosition(position).toString()
        Toast.makeText(this,item,Toast.LENGTH_SHORT).show()
    }
}
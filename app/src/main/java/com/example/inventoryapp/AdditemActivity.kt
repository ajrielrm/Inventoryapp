package com.example.inventoryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewParent
import android.widget.*
import com.example.inventoryapp.databinding.ActivityAddItemBinding

class AdditemActivity : AppCompatActivity(), AdapterView.OnItemClickListener {

    private lateinit var binding: ActivityAddItemBinding

    companion object {
        val IMAGE_REQUEST_CODE = 100
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddItemBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listKategori = resources.getStringArray(R.array.kategori_items)
        val adapter = ArrayAdapter(
            this, R.layout.list_item_kategori, listKategori
        )

        with(binding.autoCompleteTextView){
            setAdapter(adapter)
            onItemClickListener = this@AdditemActivity
        }


        binding.btnAddGambar.setOnClickListener {
            pickImageGalerry()
        }

    }

    private fun pickImageGalerry() {
        val intent = Intent(Intent.ACTION_PICK)
        intent.type = "image/*"
        startActivityForResult(intent, IMAGE_REQUEST_CODE)
    }

    private fun startActivityForResult(intent: Intent) {

    }


    override fun onItemClick(parent: AdapterView<*>?,view: View?, position: Int, id: Long) {
        val item = parent?.getItemAtPosition(position).toString()
        Toast.makeText(this, item, Toast.LENGTH_SHORT).show()
    }
}
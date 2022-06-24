package com.example.inventoryapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter: RecyclerView.Adapter<ItemAdapter.ViewHolder>(){

    private var title = arrayOf("RV110W", "AC-1200", "Catalyst 2960-L", "N200RE", "EZ-Label Printer", "HP-All in One 720")

    private var merek = arrayOf("Cisco", "Tp-Link", "Cisco", "TOTOLINK", "Casio", "HP")

    private var image = intArrayOf(R.drawable.img_router, R.drawable.img_ac, R.drawable.img_cata, R.drawable.img_nt200, R.drawable.img_ezlabel, R.drawable.img_hp)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.row_rv_inventory, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ItemAdapter.ViewHolder, position: Int) {
        holder.itemTitle.text = title[position]
        holder.itemMerek.text = merek[position]
        holder.itemImage.setImageResource(image[position])
    }

    override fun getItemCount(): Int {
        return title.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var itemImage: ImageView
        var itemTitle: TextView
        var itemMerek: TextView
        var itemHarga: TextView
        var itemStock: TextView

        init {
            itemImage = itemView.findViewById(R.id.iv_image_item)
            itemTitle = itemView.findViewById(R.id.tv_row_inventory)
            itemMerek = itemView.findViewById(R.id.tv_desc_item)
            itemHarga = itemView.findViewById(R.id.tv_harga_item)
            itemStock = itemView.findViewById(R.id.tv_jumlah_stock)


            }
        }


    }


}
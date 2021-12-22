package com.example.lifeweb.screens.home

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.lifeweb.R
import com.example.lifeweb.repository.localDb.Product

class ProductListAdapter(val productList: ArrayList<Product>, val context:Context) : RecyclerView.Adapter<ProductListAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvPrice = itemView.findViewById<TextView>(R.id.tv_price)
        val tvTitle = itemView.findViewById<TextView>(R.id.tv_title)
        val ivProduct = itemView.findViewById<ImageView>(R.id.iv_product)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.item_list_products, parent, false)
        return ViewHolder(v);    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder?.tvTitle?.text = productList[position].product_name
        holder?.tvPrice?.text = productList[position].price

        val media = productList[position].image_url
        if (media !== null) {
            Glide.with(context)
                .load(media)
                .into(holder?.ivProduct)
        } else {
            holder?.ivProduct.setImageResource(R.drawable.ic_launcher_background)
        }
    }

    override fun getItemCount(): Int {
       return productList.size
    }
}


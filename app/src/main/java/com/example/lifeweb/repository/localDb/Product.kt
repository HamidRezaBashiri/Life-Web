package com.example.lifeweb.repository.localDb

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "product_table")
data class Product(
    @ColumnInfo(name = "product_name") val product_name: String,
    @PrimaryKey val id: Int,
    @ColumnInfo(name = "price") val price: String,
    @ColumnInfo(name = "image_url") val image_url: String,
    @ColumnInfo(name = "off") val off: Boolean,
    @ColumnInfo(name = "description") val description: String,
)

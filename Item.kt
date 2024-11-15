package com.example.inventory.data

import androidx.room.Entity
import androidx.room.PrimaryKey

// Represents a table named "item_table" in the Room database
@Entity(tableName = "item_table")
data class Item(
    // Primary key for each item, auto-generated by Room
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val name: String, // Column for item name
    val price: Double, // Column for item price
    val quantity: Int // Column for item quantity
)

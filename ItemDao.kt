package com.example.inventory.data

import androidx.room.*

@Dao
interface ItemDao {
    // Inserts a new item; replaces if there's a conflict (e.g., same ID)
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(item: Item)

    // Updates an existing item in the database
    @Update
    suspend fun update(item: Item)

    // Deletes an item from the database
    @Delete
    suspend fun delete(item: Item)

    // Retrieves all items in ascending order by name
    @Query("SELECT * FROM item_table ORDER BY name ASC")
    suspend fun getAllItems(): List<Item>
}

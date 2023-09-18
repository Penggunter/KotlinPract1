package com.example.kotlinpract1.Data.Repository

import androidx.lifecycle.LiveData
import com.example.kotlinpract1.Data.DataSource.Item
import com.example.kotlinpract1.Data.DataSource.ItemDao

class ItemRepository(private val itemDao: ItemDao) {

    var getAllData: LiveData<List<Item>> = itemDao.getAll()
    suspend fun addItem(item: Item) {
        itemDao.insert(item)
    }

}
package com.example.kotlinpract1.UI.StateHolder.ViewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.kotlinpract1.Data.DataSource.Item
import com.example.kotlinpract1.Data.DataSource.ItemDatabase
import com.example.kotlinpract1.Data.Repository.ItemRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ItemVM(application: Application) : AndroidViewModel(application) {
    private val repository: ItemRepository
    val getAllData: LiveData<List<Item>>

    init {
        val itemDao = ItemDatabase.getDatabase(application).itemDao()
        repository = ItemRepository(itemDao)
        getAllData = repository.getAllData
    }

    fun addItem(item: Item) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.addItem(item)
        }
    }


}
package com.bharat.dummyapp.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.bharat.dummyapp.getFakeData
import com.bharat.dummyapp.models.PlaceItem

class MainActivityViewModel (application: Application) : AndroidViewModel(application) {

    var listOfPlaces: List<PlaceItem>? = null

    init {
        listOfPlaces = getFakeData()
    }

}

class MainViewModelFactory(private val application: Application) : ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainActivityViewModel::class.java)) {
            return MainActivityViewModel(application) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
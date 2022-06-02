package com.bharat.dummyapp.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.bharat.dummyapp.getFakeDetailData
import com.bharat.dummyapp.models.PlaceItemDetail

class MainActivity2ViewModel  (application: Application) : AndroidViewModel(application) {

    var placeDetail: PlaceItemDetail? = null

    fun getDetailData(id: Int) {
        placeDetail = getFakeDetailData().first { x -> x.id == id }
    }


}

class Main2ViewModelFactory(private val application: Application) : ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainActivity2ViewModel::class.java)) {
            return MainActivity2ViewModel(application) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
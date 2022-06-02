package com.bharat.dummyapp.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.app.ActivityOptionsCompat
import androidx.core.util.Pair
import androidx.lifecycle.ViewModelProvider
import com.bharat.dummyapp.view.adapters.ListAdapter
import com.bharat.dummyapp.databinding.ActivityMainBinding
import com.bharat.dummyapp.misc.*
import com.bharat.dummyapp.viewmodels.MainActivityViewModel
import com.bharat.dummyapp.viewmodels.MainViewModelFactory

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel
    private lateinit var viewModelFactory: MainViewModelFactory

    private lateinit var adapter: ListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModelFactory = MainViewModelFactory(this.application)
        viewModel = ViewModelProvider(this, viewModelFactory).get(MainActivityViewModel::class.java)

        adapter = ListAdapter(this, object: ListAdapter.OnItemClickListener{
            override fun onClick(position: Int, imageView: View, tvPlace: View, tvSeason: View, tvDuration: View, itemId: Int?) {
                val intent = Intent(this@MainActivity, MainActivity2::class.java)
                intent.putExtra(ItemId, itemId)

                val imageViewPair = Pair.create(imageView, CoverImageTransitionName)
                val textViewPlace = Pair.create(tvPlace, PlaceTransitionName)
                val textViewSeason = Pair.create(tvSeason, SeasonTransitionName)
                val textViewDuration = Pair.create(tvDuration, DurationTransitionName)

                val options = ActivityOptionsCompat.makeSceneTransitionAnimation(this@MainActivity, imageViewPair, textViewPlace, textViewSeason, textViewDuration)
                startActivity(intent, options.toBundle())
            }
        })

        binding.recyclerView.adapter = adapter
        adapter.data = viewModel.listOfPlaces!!
    }
}
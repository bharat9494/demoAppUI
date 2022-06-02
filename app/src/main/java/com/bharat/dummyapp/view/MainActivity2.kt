package com.bharat.dummyapp.view

import android.os.Bundle
import android.view.View
import androidx.annotation.Dimension.SP
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import coil.load
import com.bharat.dummyapp.view.adapters.ProfileListAdapter
import com.bharat.dummyapp.databinding.ActivityMain2Binding
import com.bharat.dummyapp.misc.ItemId
import com.bharat.dummyapp.viewmodels.Main2ViewModelFactory
import com.bharat.dummyapp.viewmodels.MainActivity2ViewModel
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetBehavior.STATE_HIDDEN


class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding
    private lateinit var viewModel: MainActivity2ViewModel
    private lateinit var viewModelFactory: Main2ViewModelFactory

    private lateinit var adapter: ProfileListAdapter
    var id = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        id = intent.getIntExtra(ItemId, 0)

        viewModelFactory = Main2ViewModelFactory(this.application)
        viewModel = ViewModelProvider(this, viewModelFactory).get(MainActivity2ViewModel::class.java)
            .apply {
                getDetailData(id)
            }

        val standardBottomSheetBehavior = BottomSheetBehavior.from(binding.bottomSheet.bottomSheet)
        standardBottomSheetBehavior.addBottomSheetCallback(object:
            BottomSheetBehavior.BottomSheetCallback() {
            override fun onStateChanged(bottomSheet: View, newState: Int) {
                if(newState == STATE_HIDDEN) {
                    supportFinishAfterTransition()
                }
            }

            override fun onSlide(bottomSheet: View, slideOffset: Float) {
                binding.textViewPlace.setTextSize(SP, 32-(slideOffset*8))
                binding.textViewSeason.setTextSize(SP, 16-(slideOffset*2))
                binding.textViewDuration.setTextSize(SP, 16-(slideOffset*2))
            }
        })

        binding.imageViewDetail.load(viewModel.placeDetail?.largeImageUrl)
        binding.textViewPlace.text = viewModel.placeDetail?.placeName
        binding.textViewSeason.text = viewModel.placeDetail?.season
        binding.textViewDuration.text = viewModel.placeDetail?.duration
        binding.bottomSheet.bottomSheetTitle.text = viewModel.placeDetail?.title
        binding.bottomSheet.bottomSheetDesc.text = viewModel.placeDetail?.desciption

        adapter = ProfileListAdapter(this)
        adapter.data = viewModel.placeDetail?.listOfProfiles!!
        binding.bottomSheet.recyclerView.adapter = adapter
        binding.bottomSheet.recyclerView.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.HORIZONTAL,
            false
        )

        binding.imageViewClose.setOnClickListener {
            standardBottomSheetBehavior.state = STATE_HIDDEN
        }
    }

    override fun onBackPressed() {
        supportFinishAfterTransition()
    }
}
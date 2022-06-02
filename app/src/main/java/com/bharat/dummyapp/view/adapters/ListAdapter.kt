package com.bharat.dummyapp.view.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.bharat.dummyapp.R
import com.bharat.dummyapp.models.PlaceItem

class ListAdapter (context: Context, clickListener: OnItemClickListener) : RecyclerView.Adapter<ListAdapter.ViewHolder>() {

    interface OnItemClickListener {
        fun onClick(position: Int, imageView: View, tvPlace: View, tvSeason: View, tvDuration: View, itemId: Int?)
    }

    private val mContext: Context = context
    private val mListener: OnItemClickListener = clickListener
    var data =  listOf<PlaceItem>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data[position]
        holder.bind(item, mListener, position, mContext)
    }

    override fun getItemCount(): Int {
        return data.size;
    }

    class ViewHolder private constructor(itemView: View) : RecyclerView.ViewHolder(itemView){
        private val imageViewcCoverPic: ImageView = itemView.findViewById(R.id.imageViewLarge)
        private val tvPlace: TextView = itemView.findViewById(R.id.textViewPlace)
        private val tvSeason: TextView = itemView.findViewById(R.id.textViewSeason)
        private val tvDuration: TextView = itemView.findViewById(R.id.textViewDuration)
        private val llHeader: LinearLayout = itemView.findViewById(R.id.linearLayoutHeader)

        fun bind(item: PlaceItem, onItemClickListener: OnItemClickListener, position: Int, context: Context) {

            if(position == 0) {
                llHeader.visibility = View.VISIBLE
            } else {
                llHeader.visibility = View.GONE
            }

            imageViewcCoverPic.load(item.largeImageUrl)

            imageViewcCoverPic.clipToOutline = true
            tvPlace.text = item.placeName
            tvSeason.text = item.season
            tvDuration.text = item.duration
            itemView.setOnClickListener { onItemClickListener.onClick(position, imageViewcCoverPic, tvPlace, tvSeason, tvDuration, item.id) }
        }

        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_list_item, parent, false)
                return ViewHolder(view)
            }
        }
    }

}
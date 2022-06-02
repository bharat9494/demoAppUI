package com.bharat.dummyapp.view.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import coil.transform.CircleCropTransformation
import com.bharat.dummyapp.R
import com.bharat.dummyapp.models.Profiles

class ProfileListAdapter (context: Context) : RecyclerView.Adapter<ProfileListAdapter.ViewHolder>() {

    private val mContext: Context = context
    var data =  listOf<Profiles>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data[position]
        holder.bind(item, position, mContext)
    }

    override fun getItemCount(): Int {
        return data.size;
    }

    class ViewHolder private constructor(itemView: View) : RecyclerView.ViewHolder(itemView){
        private val imageViewProfile: ImageView = itemView.findViewById(R.id.imageViewProfile)
        private val tvName: TextView = itemView.findViewById(R.id.textViewName)

        fun bind(item: Profiles, position: Int, context: Context) {
            imageViewProfile
                .load(item.profilePic) {
                    crossfade(true)
                    transformations(CircleCropTransformation())
                }

            tvName.text = item.name
        }

        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_profile, parent, false)
                return ViewHolder(view)
            }
        }
    }

}
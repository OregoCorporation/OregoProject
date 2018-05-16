package com.example.anton.oregov1.adapter.oregoGalleryAdapter

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import com.example.anton.oregov1.R
import com.example.anton.oregov1.oregoPhotoManagement.OregoPhotoManager

class OregoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {

    var mPhotoImageView: ImageView = itemView.findViewById(R.id.iv_photo)

    init {
        itemView.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        val position = adapterPosition
        if (position != RecyclerView.NO_POSITION) {
            val oregoPhoto = OregoPhotoManager.getSpacePhotos()[position]
            println("INIT ME!")
            //Я понятия не имею в какое Activity идти: ---------------->
        }
    }
}
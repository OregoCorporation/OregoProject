package com.example.anton.oregov1.adapter.oregoGalleryAdapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.anton.oregov1.R
import com.example.anton.oregov1.activity.MainActivity
import com.example.anton.oregov1.oregoPhotoManagement.OregoPhotoManager

class OregoGalleryAdapter : RecyclerView.Adapter<OregoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OregoViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val photoView = inflater.inflate(R.layout.orego_photo_item, parent, false)
        return OregoViewHolder(photoView)
    }

    override fun onBindViewHolder(holder: OregoViewHolder, position: Int) {
        val spacePhoto = OregoPhotoManager.getSpacePhotos()[position]
        val imageView = holder.mPhotoImageView
        Glide.with(MainActivity.THIS)
                .load(spacePhoto.url)
                .into(imageView)
    }

    override fun getItemCount(): Int = OregoPhotoManager.getSpacePhotos().size
}
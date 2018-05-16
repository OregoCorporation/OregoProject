package com.example.starkre.oregoglidegalery.oregoPhotoManagement

import com.example.starkre.oregoglidegalery.OregoPhoto

object OregoPhotoManager {

    private val oregoPhotoList = mutableListOf(
            //Temporary initialization:
            OregoPhoto("http://i.imgur.com/zuG2bGQ.jpg", "Galaxy")
            , OregoPhoto("http://i.imgur.com/ovr0NAF.jpg", "Space Shuttle")
            , OregoPhoto("http://i.imgur.com/n6RfJX2.jpg", "Galaxy Orion")
            , OregoPhoto("http://i.imgur.com/qpr5LR2.jpg", "Earth")
            , OregoPhoto("http://i.imgur.com/pSHXfu5.jpg", "Astronaut")
            , OregoPhoto("http://i.imgur.com/3wQcZeY.jpg", "Satellite"))

    fun add(oregoPhoto: OregoPhoto) = this.oregoPhotoList.add(oregoPhoto)

    fun remove(oregoPhoto: OregoPhoto) = this.oregoPhotoList.remove(oregoPhoto)

    fun getSpacePhotos(): List<OregoPhoto> = oregoPhotoList
}
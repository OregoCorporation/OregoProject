package com.example.anton.oregov1.oregoPhotoManagement;

import android.os.Parcel
import android.os.Parcelable

data class OregoPhoto(val url: String, val title: String) : Parcelable {

    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readString())

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(url)
        parcel.writeString(title)
    }

    override fun describeContents(): Int = 0

    companion object CREATOR : Parcelable.Creator<OregoPhoto> {

        override fun createFromParcel(parcel: Parcel): OregoPhoto = OregoPhoto(parcel)

        override fun newArray(size: Int): Array<OregoPhoto?> = arrayOfNulls(size)
    }
}
package com.example.mainactivity.movie

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MovieModel(val title: String?, val image_url: String?, val source_url: String?):Parcelable


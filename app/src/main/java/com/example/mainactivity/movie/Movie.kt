package com.example.mainactivity.movie

import com.google.gson.annotations.SerializedName

//vote_count,id,video,vote_average,title,popularity,poster_path,original_language,original_title,genre_ids,backdrop_path,adult,overview,release_date
//data class Movie(val title: String, val overview: String, val vote_average: Float, val vote_count: Int, val video: Boolean, val poster_path: String, val release_date: String)
//data class Movie (val title: String, val imageUrl: String)

//data class Movie (val title: String, @SerializedName("image_url") val imageUrl: String)

data class Movie (val title: String,  val image_url: String, val source_url: String)

//import com.google.gson.annotations.Expose
//import com.google.gson.annotations.SerializedName
//
//class Movie {
//
//    @SerializedName("publisher")
//    @Expose
//    var publisher: String? = null
//    @SerializedName("f2f_url")
//    @Expose
//    var f2fUrl: String? = null
//    @SerializedName("ingredients")
//    @Expose
//    var ingredients: List<String>? = null
//    @SerializedName("source_url")
//    @Expose
//    var sourceUrl: String? = null
//    @SerializedName("recipe_id")
//    @Expose
//    var recipeId: String? = null
//    @SerializedName("image_url")
//    @Expose
//    var imageUrl: String? = null
//    @SerializedName("social_rank")
//    @Expose
//    var socialRank: Double? = null
//    @SerializedName("publisher_url")
//    @Expose
//    var publisherUrl: String? = null
//    @SerializedName("title")
//    @Expose
//    var title: String? = null
//
//}
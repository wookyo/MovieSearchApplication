package com.example.data.model.movie

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Serializable
data class MovieResponse(
    @SerializedName("display")
    val display: Int,

    @SerializedName("items")
    val items: List<MovieEntity>,

    @SerializedName("lastBuildDate")
    val lastBuildDate: String,

    @SerializedName("start")
    val start: Int,

    @SerializedName("total")
    val total: Int
)
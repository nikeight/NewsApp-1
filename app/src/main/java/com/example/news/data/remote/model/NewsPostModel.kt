package com.example.news.data.remote.model


import com.google.gson.annotations.SerializedName

data class NewsPostModel(
    @SerializedName("articles")
    val articles: List<Article>,
    @SerializedName("status")
    val status: String,
    @SerializedName("totalResults")
    val totalResults: Int
)
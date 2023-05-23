package com.example.simplenewsapp.model

data class ResponseModel(
    val status: String,
    val totalResult: Int,
    val articles: List<News>
)
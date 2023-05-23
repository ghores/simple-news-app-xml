package com.example.simplenewsapp

data class ResponseModel(
    val status: String,
    val totalResult: Int,
    val articles: List<News>
)
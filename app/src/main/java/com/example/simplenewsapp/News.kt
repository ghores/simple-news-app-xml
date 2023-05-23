package com.example.simplenewsapp

data class News(
    val author: String,
    val content: String,
    val publishedAt: String,
    val title: String,
    val description: String,
    val source: Source,
    val url: String,
    val urlToImage: String
)

data class Source(
    val id: String,
    val name: String
)
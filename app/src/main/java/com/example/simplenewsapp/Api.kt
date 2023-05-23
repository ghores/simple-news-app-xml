package com.example.simplenewsapp

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {

    @GET("top-headlines")
    suspend fun getNews(
        @Query("sources") source: String,
        @Query("apiKey") apiKey: String
    ): Response<ResponseModel>
}
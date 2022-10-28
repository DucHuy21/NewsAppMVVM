package com.example.newsappmvvm.api

import com.example.newsappmvvm.model.NewsRespone
import com.example.newsappmvvm.ulti.Constants.Companion.API_KEY_1
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.*

interface NewsAPI {

    @GET("v2/top-headlines")
    suspend fun getBreakingNews(
        @Query("country")
        countryCode: String = "us",
        @Query("page")
        pageNumber: Int = 1,
        @Query("apiKey")
        apiKey: String = API_KEY_1
    ): Response<NewsRespone>

    @GET("v2/everything")
    suspend fun searchForNews(
        @Query("q")
        keyword: String,
        @Query("page")
        pageNumber: Int = 1,
        @Query("apiKey")
        apiKey: String = API_KEY_1
    ): Response<NewsRespone>
}
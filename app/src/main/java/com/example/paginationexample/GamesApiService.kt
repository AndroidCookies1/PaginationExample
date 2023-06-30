package com.example.paginationexample

import retrofit2.http.GET
import retrofit2.http.Header

interface GamesApiService {
    @GET("/games?page=0&per_page=25")
    suspend fun getData(
        @Header("X-RapidAPI-Key") apiKey: String ="", //TODO: ADD API KEY
        @Header("X-RapidAPI-Host") host: String="" //TODO: ADD HOST
    ): Data
}
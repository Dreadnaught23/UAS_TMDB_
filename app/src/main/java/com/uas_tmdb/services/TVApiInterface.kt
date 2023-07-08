package com.uas_tmdb.services

import com.uas_tmdb.models.TVResponse
import retrofit2.Call
import retrofit2.http.GET

interface TVApiInterface {
    @GET("/3/tv/popular?api_key=2c7e6ab9a0ea816b8dd03293fbb7d81d")
    fun getTVList(): Call<TVResponse>
}
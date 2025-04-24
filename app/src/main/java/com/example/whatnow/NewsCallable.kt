package com.example.whatnow

import retrofit2.Call
import retrofit2.http.GET

interface NewsCallable {
    @GET ("/v2/top-headlines?country=us&category=general&apiKey=77d40863e30c4f51ae48b36cfde2038c&pageSize=30")
    fun getNews(): Call<News>
}
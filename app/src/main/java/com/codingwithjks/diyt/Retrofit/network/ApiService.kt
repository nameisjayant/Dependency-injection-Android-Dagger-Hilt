package com.codingwithjks.diyt.Retrofit.network

import com.codingwithjks.diyt.Retrofit.Posts
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    companion object{
        const val BASE_URL = "https://jsonplaceholder.typicode.com/"
    }

    @GET("posts")
    suspend fun getPosts():Response<List<Posts>>

    @GET("albums")
    suspend fun getAlbums():Response<List<Posts>>

}
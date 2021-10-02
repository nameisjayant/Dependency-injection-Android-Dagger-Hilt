package com.codingwithjks.diyt.Retrofit

import com.codingwithjks.diyt.Retrofit.network.ApiService
import com.codingwithjks.diyt.Retrofit.utils.result
import javax.inject.Inject

class MainRepository @Inject constructor(private val apiService: ApiService) {

    fun getPosts() = result {
        apiService.getPosts()
    }

    fun getAlbum() = result {
        apiService.getAlbums()
    }
}
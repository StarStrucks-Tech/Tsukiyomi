package com.starstruckstech.pgpodandroid.network_helper.app_helper.public_api

import com.starstruckstech.pgpodandroid.Post
import retrofit2.Call
import retrofit2.http.GET

interface PublicApiService {
    @GET("posts")
    fun getPost(): Call<List<Post>>
}
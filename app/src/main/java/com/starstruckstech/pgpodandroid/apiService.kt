package com.starstruckstech.pgpodandroid

import retrofit2.http.GET
interface ApiServicee {
    @GET("posts")
    suspend fun getPosts(): List<Post>
}

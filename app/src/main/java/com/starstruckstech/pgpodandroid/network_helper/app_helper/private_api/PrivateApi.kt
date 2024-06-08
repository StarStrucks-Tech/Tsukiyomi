package com.starstruckstech.pgpodandroid.network_helper.app_helper.private_api

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header

interface PrivateApiService {
    @GET("profile")
    fun getProfile(@Header("Authorization") token: String): Call<String>
}
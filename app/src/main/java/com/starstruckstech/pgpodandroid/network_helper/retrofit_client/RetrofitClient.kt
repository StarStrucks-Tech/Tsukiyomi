package com.starstruckstech.pgpodandroid.network_helper.retrofit_client

import com.starstruckstech.pgpodandroid.PrivateApiService
import com.starstruckstech.pgpodandroid.PublicApiService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {

    private const val BASE_URL = "https://jsonplaceholder.typicode.com/"

    private val retrofit: Retrofit

    val publicApiService: PublicApiService
    private val privateApiService: PrivateApiService

    init {
        retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        publicApiService = retrofit.create(PublicApiService::class.java)
        privateApiService = retrofit.create(PrivateApiService::class.java)
    }
}

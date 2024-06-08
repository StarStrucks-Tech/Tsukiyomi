package com.starstruckstech.pgpodandroid.network_helper.app_helper.public_api

import com.starstruckstech.pgpodandroid.repository.Post
import retrofit2.Call
import retrofit2.http.GET
/*
*Interface for public API
* defines methods to interact with public API
 */
interface PublicApiService {
    /**
     * This method sends a GET request to the "posts" endpoint of the API and returns
     * a Call object with a List of Post objects.
     * @return a object which can be used to send the request
     * response will contain a list of post
     */
    @GET("posts")
    fun getPost(): Call<List<Post>>
}
package com.starstruckstech.pgpodandroid.network_helper

import android.util.Log
import com.starstruckstech.pgpodandroid.Post
import com.starstruckstech.pgpodandroid.network_helper.retrofit_client.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class NetworkHelper {
    fun getPosts(callback: (List<Post>?) -> Unit) {
        val call = RetrofitClient.publicApiService.getPost()
        call.enqueue(object : Callback<List<Post>> {
            override fun onResponse(call: Call<List<Post>>, response: Response<List<Post>>) {
                if (response.isSuccessful) {
                    callback(response.body())
                } else {
                    Log.e("NetworkHelper", "getPosts: Error ${response.code()}")
                    callback(null)
                }
            }

            override fun onFailure(call: Call<List<Post>>, t: Throwable) {

                callback(null)
            }

        })
    }
}
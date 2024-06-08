package com.starstruckstech.pgpodandroid.repository

import com.starstruckstech.pgpodandroid.network_helper.NetworkHelper
/**
 * It acts as a mediator between the network layer and the rest of the application.
 *@param networkhelper : NetworkHelper
 */

class DataRepository(private val networkHelper: NetworkHelper) {
    fun getPosts(callback: (List<Post>?) -> Unit) {
        networkHelper.getPosts { result ->
            callback(result)
        }
    }
}


data class Post(
    val userId: Int,
    val id: Int,
    val title: String,
    val body: String
)

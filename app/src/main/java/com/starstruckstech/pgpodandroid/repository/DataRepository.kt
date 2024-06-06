package com.starstruckstech.pgpodandroid.repository

import com.starstruckstech.pgpodandroid.network_helper.NetworkHelper
/**
 * It acts as a mediator between the network layer and the rest of the application.
 */
class DataRepository (private val networkHelper: NetworkHelper){
    /**
     * Constructs a DataRepository with the provided NetworkHelper instance.
     * @param networkHelper the NetworkHelper instance used to perform network operations
     */
    fun getPosts(callback: (List<Post>?)->Unit){
        networkHelper.getPosts{results->
                callback(results)
            }
        }

}

data class Post(
    val userId: Int,
    val id: Int,
    val title: String,
    val body: String
)
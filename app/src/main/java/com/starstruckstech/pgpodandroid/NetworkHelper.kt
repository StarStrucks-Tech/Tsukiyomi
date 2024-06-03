package com.starstruckstech.pgpodandroid

class NetworkHelper {
class NetworkHelper(private val apiService: ApiServicee) {
    suspend fun getPosts(): List<Post> {
        return apiService.getPosts()
    }
}
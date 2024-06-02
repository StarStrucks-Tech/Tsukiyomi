package com.starstruckstech.pgpodandroid

class PostRepository(private val apiService: ApiServicee) {
    suspend fun getPosts(): List<Post> = apiService.getPosts()
}

data class Post(
    val userId: Int,
    val id: Int,
    val title: String,
    val body: String
)
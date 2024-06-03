package com.starstruckstech.pgpodandroid

class PostRepository(private val networkHelper: NetworkHelper) {
    suspend fun getPosts(): List<Post> {
        return networkHelper.getPosts()
    }
}

data class Post(
    val userId: Int,
    val id: Int,
    val title: String,
    val body: String
)
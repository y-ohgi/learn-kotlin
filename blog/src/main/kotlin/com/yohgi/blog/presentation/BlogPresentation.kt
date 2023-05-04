package com.yohgi.blog.presentation

data class BlogResponse(
    val id: Long
)

interface BlogPresentation {
    fun listBlog(): List<BlogResponse>
}
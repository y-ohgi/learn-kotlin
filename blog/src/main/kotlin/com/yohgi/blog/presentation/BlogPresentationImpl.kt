package com.yohgi.blog.presentation

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(
    path = ["api"],
    produces = [MediaType.APPLICATION_JSON_VALUE]
)
class BlogPresentationImpl : BlogPresentation {

    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/blogs"]
    )
    override fun listBlog(): List<BlogResponse> {
        val blog = BlogResponse(1)

        return listOf(blog)
    }
}
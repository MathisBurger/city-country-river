package de.mathisburger.ccr.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class IndexController {

    @GetMapping
    fun index(): Response {
        return Response("Server up and running", 200);
    }
}

data class Response(val message: String, val statusCode: Int)
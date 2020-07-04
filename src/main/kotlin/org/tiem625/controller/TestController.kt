package org.tiem625.controller

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {

    data class Payload(
        val a: String,
        val b: String
    )

    @PostMapping("try")
    fun acceptJson(payload: Payload) {
        println(payload)
    }

}
package com.vantablack.msbook.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HealthCheckController {

    @GetMapping("/ping")
    fun healthCheck() = "Pong!"
}
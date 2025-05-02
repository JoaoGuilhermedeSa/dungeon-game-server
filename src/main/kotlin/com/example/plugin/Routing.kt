package com.example.plugin

import io.ktor.server.application.Application
import io.ktor.server.routing.get
import io.ktor.server.routing.routing
import io.ktor.server.response.respond
import com.example.model.GameResponse
import com.example.service.GameService

fun Application.configureRouting() {

    routing {
        get("/api/game") {
            call.respond(GameService.generateResponse())
        }
    }
}
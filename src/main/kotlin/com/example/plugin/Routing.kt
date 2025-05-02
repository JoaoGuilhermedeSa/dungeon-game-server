package com.example.plugin

import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*
import com.example.service.GameService

fun Application.configureRouting() {

    routing {
        get("/api/game") {
            call.respond(GameService.generateResponse())
        }
    }
}
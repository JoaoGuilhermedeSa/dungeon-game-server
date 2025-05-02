package com.example.service

object MessageService {
    private val steps = listOf(
        "right",
        "down"
    )

    fun generateMessages(): List<String> {
        return List(3) { steps.random() }
    }
}
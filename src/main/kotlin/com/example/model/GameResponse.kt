package com.example.model

import kotlinx.serialization.Serializable

@Serializable
data class GameResponse(
    val matrix: List<List<Int>>,
    val messages: List<String>,
    val score: Int
)
package com.example.model

import kotlinx.serialization.Serializable

@Serializable
data class GameResponse(
    val board: List<List<Int>>,
    val steps: List<String>,
    val minHealth: Int
)
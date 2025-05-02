package com.example.service

import com.example.model.GameResponse
import kotlin.random.Random

object GameService {
    fun generateResponse(): GameResponse {
        val matrix = MatrixService.generateMatrix(3, 3)
        val messages = MessageService.generateMessages()
        val score = ScoreService.generateScore()

        return GameResponse(matrix, messages, score)
    }
}
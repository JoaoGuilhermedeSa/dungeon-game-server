package com.example.service

import kotlin.random.Random

object ScoreService {
    fun generateScore(): Int {
        return Random.nextInt(0, 1000)
    }
}
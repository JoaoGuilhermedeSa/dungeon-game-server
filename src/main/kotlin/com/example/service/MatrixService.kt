package com.example.service

import kotlin.random.Random

object MatrixService {
    fun generateMatrix(rows: Int, cols: Int): List<List<Int>> {
        return List(rows) {
            List(cols) { Random.nextInt(0, 100) }
        }
    }
}
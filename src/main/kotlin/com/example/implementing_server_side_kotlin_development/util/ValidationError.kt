package com.example.implementing_server_side_kotlin_development.util

/**
 * ドメインオブジェクトのバリデーションにおけるエラー型
 *
 * 必ずエラーメッセージを記述する
 *
 */
interface ValidationError {
    /**
     * エラーメッセージ
     */
    val message: String
}
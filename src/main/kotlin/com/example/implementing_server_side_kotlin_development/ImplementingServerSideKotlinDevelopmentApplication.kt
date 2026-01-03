package com.example.implementing_server_side_kotlin_development

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

/**
 * ImplementingServerSideKotlinDevelopmentApplication
 *
 */
@SpringBootApplication
class ImplementingServerSideKotlinDevelopmentApplication

/**
 * main
 *
 * サンプルアプリケーションのメイン関数
 *
 * @param args
 */
fun main(args: Array<String>) {
    @Suppress("SpreadOperator") // 追加
    runApplication<ImplementingServerSideKotlinDevelopmentApplication>(*args)
}

package com.example.config

import io.github.cdimascio.dotenv.dotenv

object AppConfig {
    private val env = dotenv {
        ignoreIfMissing = true
        filename = ".env"
    }

    val JWT_SECRET = env["JWT_SECRET"] ?: "your-super-secret-key-change-in-production"

    val DB_HOST = env["DB_HOST"] ?: "localhost"
    val DB_PORT = env["DB_PORT"]?.toInt() ?: 3306
    val DB_NAME = env["DB_NAME"] ?: "music_app"
    val DB_USER = env["DB_USER"] ?: "root"
    val DB_PASSWORD = env["DB_PASSWORD"] ?: "root"
}
package com.example.config

class JwtConfig(private val secret: String = AppConfig.JWT_SECRET) {
    private val validityInMs = 36_000_00 * 10 // 10 hours
    val issuer = "music-app"
    val audience = "music-app-users"
}
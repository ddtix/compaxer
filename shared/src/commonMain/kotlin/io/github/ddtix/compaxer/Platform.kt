package io.github.ddtix.compaxer

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
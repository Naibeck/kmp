package io.betstudio.bedit

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
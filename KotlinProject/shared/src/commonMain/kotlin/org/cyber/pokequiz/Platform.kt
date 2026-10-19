package org.cyber.pokequiz

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
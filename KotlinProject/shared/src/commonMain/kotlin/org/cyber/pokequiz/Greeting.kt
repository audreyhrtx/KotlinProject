package org.cyber.pokequiz

class Greeting {
    private val platform = getPlatform()

    fun greet(): String = "Bonjour depuis ${platform.name}"
}
package ya.weber.lifelive

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
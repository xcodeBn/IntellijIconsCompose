package github.xcodebn.intellijicons

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
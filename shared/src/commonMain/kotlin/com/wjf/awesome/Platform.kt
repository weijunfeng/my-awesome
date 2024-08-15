package com.wjf.awesome

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
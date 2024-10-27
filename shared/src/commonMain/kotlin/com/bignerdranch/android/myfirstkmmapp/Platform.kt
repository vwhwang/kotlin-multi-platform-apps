package com.bignerdranch.android.myfirstkmmapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
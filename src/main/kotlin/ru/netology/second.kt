package ru.netology

fun main() {
    print("Укажите колличество лайков: ")

    val likes = readLine()?.toInt() ?: return

    if (likes % 2 == 0) println("Понравилось $likes людям") else println("Понравилось $likes человеку")
}
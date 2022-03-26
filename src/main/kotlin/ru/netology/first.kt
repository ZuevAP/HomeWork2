package ru.netology

const val AMOUNT = 100_000_00
const val COMMISSION = 0.0075F
const val MIN_COMMISSION= 35

fun main(){

    val currentPercent = (AMOUNT * COMMISSION).toInt()
    val finalCommission = if (currentPercent < MIN_COMMISSION ) MIN_COMMISSION else currentPercent

    print("Комиссия за перевод : $finalCommission копеек")

}


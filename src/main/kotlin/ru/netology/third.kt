package ru.netology


fun main() {

    val purchaseAmount = 1_000_001
    var premiumCustomer: Boolean = true

    val discount = if (purchaseAmount < 1_001) 0
    else if (purchaseAmount >= 1_001 && purchaseAmount <= 10_000) 100
    else purchaseAmount / 100 * 5

    val premiumDiscount = if (premiumCustomer == true) purchaseAmount / 100 * 1 else 0


    var finalDiscount = discount + premiumDiscount
    var finalPayment = purchaseAmount - finalDiscount

    println("Покупка на сумму: $purchaseAmount \nСкидка покупателя: $finalDiscount руб. \nПлатеж составит: $finalPayment руб.")


}
fun main() {
    val amount = 10000
    val commission = 0.0075
    val minCommission = 35

    val totalCommission = amount * commission
    val result = if (totalCommission > minCommission) totalCommission else minCommission
    println("Комиссия: $result")
}
package lab1

fun main() {
    print("Find the number of prime numbers n: ")
    val n = readln().toInt()

    var count = 0
    var number = 2

    while (count < n) {
        var isPrime = true
        for (i in 2..Math.sqrt(number.toDouble()).toInt()) {
            if (number % i == 0) {
                isPrime = false
                break
            }
        }
        if (isPrime) {
            count++
            println("$count-th number: $number")
        }
        number++
    }
}
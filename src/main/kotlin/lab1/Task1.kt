package lab1

fun main() {
    print("Enter a positive integer: ")
    val input = readln()

    // Способ через символы строки (самый простой)
    val first = input.first().digitToInt()
    val last = input.last().digitToInt()

    println("The sum of the first and last digits: ${first + last}")
}
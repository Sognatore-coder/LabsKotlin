package lab1

fun main() {
    var count = 0
    var sum = 0

    println("Enter numbers (enter 0 to finish):")
    while (true) {
        val num = readln().toInt()
        if (num == 0) break
        count++
        sum += num
    }

    if (count > 0) {
        println("Number of entered values: $count")
        println("All sum: $sum")
        println("Arithmetic mean: ${sum.toDouble() / count}")
    } else {
        println("Numbers were not entered.")
    }
}
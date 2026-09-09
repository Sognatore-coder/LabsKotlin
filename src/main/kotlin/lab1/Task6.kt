package lab1

fun main() {
    val array = arrayOf(2, 3, 5, 4)

    // Цикл for
    var prodFor = 1; var minFor = array[0]; var maxFor = array[0]
    for (num in array) {
        prodFor *= num
        if (num < minFor) minFor = num
        if (num > maxFor) maxFor = num
    }

    // Цикл while
    var prodWhile = 1; var minWhile = array[0]; var maxWhile = array[0]; var i = 0
    while (i < array.size) {
        val num = array[i]
        prodWhile *= num
        if (num < minWhile) minWhile = num
        if (num > maxWhile) maxWhile = num
        i++
    }

    // Оператор forEach
    var prodEach = 1; var minEach = array[0]; var maxEach = array[0]
    array.forEach { num ->
        prodEach *= num
        if (num < minEach) minEach = num
        if (num > maxEach) maxEach = num
    }

    // Через reduce() и встроенные функции min/max
    val prodReduce = array.reduce { acc, num -> acc * num }
    val minFunc = array.minOrNull() ?: array[0]
    val maxFunc = array.maxOrNull() ?: array[0]

    println("Results:")
    println("Multiply: $prodReduce, Min: $minFunc, Max: $maxFunc")
}
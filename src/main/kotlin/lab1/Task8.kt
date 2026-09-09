package lab1

class ArrayStats(private val array: IntArray) {

    fun sumOfPositives(): Int {
        return array.filter { it > 0 }.sum()
    }

    fun product(): Long {
        if (array.isEmpty()) return 0
        return array.map { it.toLong() }.reduce { acc, num -> acc * num }
    }

    fun average(): Double {
        return array.average()
    }
}

fun main() {
    val stats = ArrayStats(intArrayOf(-2, 3, 4, -1, 5))
    println("Sum of positive values: ${stats.sumOfPositives()}")
    println("Product of all elements: ${stats.product()}")
    println("Arithmetic mean: ${stats.average()}")
}
package lab1

fun main() {
    val array = arrayOf(1, 5, 2, 8, 3, 10, 4, 1, 7, 2)
    println("Source array: ${array.joinToString()}")

    print("For: ")
    for (i in 1 until array.size - 1) {
        if (array[i] > array[i - 1] && array[i] > array[i + 1]) print("${array[i]} ")
    }
    println()

    print("While: ")
    var j = 1
    while (j < array.size - 1) {
        if (array[j] > array[j - 1] && array[j] > array[j + 1]) print("${array[j]} ")
        j++
    }
    println()

    print("ForEach: ")
    array.indices.forEach { i ->
        if (i > 0 && i < array.size - 1) {
            if (array[i] > array[i - 1] && array[i] > array[i + 1]) print("${array[i]} ")
        }
    }
    println()
}
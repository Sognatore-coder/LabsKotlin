package lab1

fun main() {
    val target = (0..10).random()
    println("The program has picked a number between 0 and 10. Try to guess it")

    while (true) {
        print("Your option: ")
        val guess = readln().toInt()
        when {
            guess > target -> println("Many")
            guess < target -> println("Few")
            else -> {
                println("You guessed it")
                break
            }
        }
    }
}
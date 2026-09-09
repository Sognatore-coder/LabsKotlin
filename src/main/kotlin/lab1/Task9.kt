package lab1

import kotlin.math.sqrt

class Vector(val x: Double, val y: Double, val z: Double) {

    fun length(): Double = sqrt(x * x + y * y + z * z)

    fun dotProduct(other: Vector): Double {
        return this.x * other.x + this.y * other.y + this.z * other.z
    }

    infix fun dot(other: Vector): Double = this.dotProduct(other)

    operator fun times(other: Vector): Double = this.dotProduct(other)
}

fun globalDotProduct(v1: Vector, v2: Vector): Double {
    return v1.x * v2.x + v1.y * v2.y + v1.z * v2.z
}

fun main() {
    val v1 = Vector(1.0, 2.0, 3.0)
    val v2 = Vector(3.0, 2.0, 1.0)

    println("Vector length v1: ${v1.length()}")
    println("Scalar product (method): ${v1.dotProduct(v2)}")
    println("Scalar product (infix): ${v1 dot v2}")
    println("Scalar product (operator *): ${v1 * v2}")
    println("Scalar product (external function): ${globalDotProduct(v1, v2)}")
}

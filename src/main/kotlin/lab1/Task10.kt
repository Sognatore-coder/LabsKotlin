package lab1

open class Vehicle {
    open val name: String = "Transport vehicle"
    open val speed: Int = 0

    open fun start() {
        println("$name began to move at a speed $speed km/h")
    }

    open fun stop() {
        println("$name stopped")
    }
}

class Boat : Vehicle() {
    override val name = "Boat"
    override val speed = 30
}

class Plane : Vehicle() {
    override val name = "Plane"
    override val speed = 800

    override fun start() {
        println("$name it took off and gained speed $speed km/h")
    }
}

class Tank : Vehicle() {
    override val name = "Tank"
    override val speed = 60
}

fun main() {
    val vehicles: List<Vehicle> = listOf(Boat(), Plane(), Tank())

    for (vehicle in vehicles) {
        vehicle.start()
        vehicle.stop()
        println("---")
    }
}

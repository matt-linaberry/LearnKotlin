//class Car constructor(val make: String, val model: String, var color: String) {
//    // we initialized the two values already!
//
//    // methods
//
//    fun accelerate() {
//        println("vroom vroom")
//    }
//
//    fun details() {
//        println("This is a $color $make $model")
//    }
//}
//
//class Truck(val make: String, val model: String, val towingCapacity: Int) {
//
//    fun tow() {
//        println("taking the horses to the rodeo!")
//    }
//
//    fun details() {
//        println("The $make $model has a towing capacity of $towingCapacity lbs")
//    }
//}

open class Vehicle(val make: String, val model: String) {
    open fun accelerate() {
        println("vroom vroom!")
    }

    fun park() {
        println("Parking the vehicle")
    }

    fun brake() {
        println("STOP!")
    }
}
// we're calling the 'super' constructor like this
class Car(make: String, model: String, var color: String) : Vehicle(make, model) {

}

class Truck(make: String, model: String, var towingCapacity: Int) : Vehicle(make, model) {
    override fun accelerate() {
        println("BIG TIME VROOM!")
        super.accelerate()  // call the super!
    }

    fun tow() {
        println("Headed to the mountains with $towingCapacity pounds of crap!")
    }
}

fun main(args: Array<String>) {

    val tesla = Car("Tesla", "Model S", "Red")
    tesla.accelerate()

    val truck = Truck("Ford", "F-150", 10000)
    truck.accelerate()
    truck.tow()
//    val car = Car("Toyota", "Avalon", "Red")
//    println(car.make)
//    println(car.model)
//
//    car.accelerate()
//    car.details()
//    val truck = Truck("Ford","F-150", 10000)
//    truck.tow()
//    truck.details()
}
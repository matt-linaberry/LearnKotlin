fun main(args: Array<String>) {
    val rebels = mutableListOf("Lea", "Luke", "Han Solo", "Mon Mothma")
    val rebelVehiclesMap = mapOf("Solo" to "Millenium Falcon", "Luke" to "Landspeeder")
    val rebelVehicles = hashMapOf("Solo" to "Millenium Falcon", "Luke" to "Landspeeder", "Boba Fett" to "Rocket Pack")

    for (rebel in rebels) {
        println("Name: $rebel")
    }

    for ((key, value) in rebelVehicles) {
        println("Name: $key Vehicle: $value")
    }

    var x = 10

    while (x > 0) {
        println(x)
        x--
    }
}
fun main(args: Array<String>) {
    val imperials = listOf("Emperor", "Darth Vader", "Boba Fett", "Tarkin")

    println(imperials.sorted())
    println(imperials[2])
    println(imperials.first())
    println(imperials.contains("Boba Fett"))
    println(imperials.contains("Luke"))
    println(imperials)

    val rebels = mutableListOf("Lea", "Luke", "Han Solo", "Mon Mothma")
    println(rebels.size)
    rebels.add("Chewy")
    println(rebels)
    rebels.add(0, "Lando")
    println(rebels)

    rebels.remove("Han Solo")
    println(rebels)

    // hashmaps
    val rebelVehiclesMap = mapOf("Solo" to "Millenium Falcon", "Luke" to "Landspeeder")
    println(rebelVehiclesMap["Solo"])
    println(rebelVehiclesMap.get("Solo"))
    println(rebelVehiclesMap.getOrDefault("Lea", "This ship doesn't exist!"))

    println(rebelVehiclesMap.keys)
    println(rebelVehiclesMap.values)

    val rebelVehicles = hashMapOf("Solo" to "Millenium Falcon", "Luke" to "Landspeeder", "Boba Fett" to "Rocket Pack")
    rebelVehicles["Luke"] = "X-Wing"

    rebelVehicles.put("Lea", "Tantive IV")
    println(rebelVehicles)
    rebelVehicles.remove("Boba Fett")
    rebelVehicles.clear() // its empty!
    rebelVehicles.isEmpty() // is it empty?

    


}
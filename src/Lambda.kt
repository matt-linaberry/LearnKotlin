fun main(args: Array<String>) {
    val printMessage = { message: String -> println(message)}

    // a function passed as an expression

    printMessage("Hello World!")

    val sumA = {x: Int, y: Int -> x + y}

    println(sumA(5, 10))

    val sumB : (Int, Int) -> Int = {x,y -> x + y}
    println(sumB(8,14))

    //Unit is a void!
    fun downloadData(url: String, completion: () -> Unit) {
        // sent a download request.
        // got back data
        // there were no network problems
        completion()
    }

    // call downloadDataFunction
    downloadData("fakeUrl.com",{
        // now we are in our completion handler.
        println("The code here runs only after the completion()")
    })

    fun downloadCarData(url: String, completion: (Car) -> Unit) {
        val car = Car("Tesla", "Model X", "Gray")
        completion(car)
    }

    downloadCarData("anotherFakeUrl.com") {
        car ->
        println(car.color)
        println(car.make)

        // for one param...
//        println(it.color)
//        println(it.make)
    }

    fun downloadTruckData(url: String, completion: (Truck?, Boolean) -> Unit) {
        val webRequestSuccess = false
        if (webRequestSuccess) {
            val truck = Truck("Ford", "F-150", 10000)
            completion(truck, webRequestSuccess)
        }
        else {
            completion(null, false)
        }
    }

    downloadTruckData("fakeurlagain.com") {
        truck, b ->
        if (b) {
            (truck?.tow())
        }
        else {
            println("Fail!")
        }
    }

}
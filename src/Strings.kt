fun main(args: Array<String>) {
    val str = "May the force be with you."
    println(str)

    val rawCrawl = """|A long time ago,
        |in a galaxy
        |far, far, away ...
        |BUMM BUMM BUMMMMM""".trimMargin()

    println(rawCrawl)
//
//    for (char in str) {
//        println(char)
//    }

    val contentEquals = str.contentEquals("May th force be with you.")
    println(contentEquals)

    val contains = str.contains("Force", false)
    println(contains)

    val uppercase = str.toUpperCase()
    val lower = str.toLowerCase()
    println(uppercase)
    println(lower)

    val num = 6
    val stringNum = num.toString()
    println(stringNum)

    val subsequence = str.subSequence(4, 13)
    println(subsequence)

    // String templates
    val luke = "Luke Skywalker"
    val lightSaberColor = "green"
    val vehicle = "land speeder"
    val age = 27
    println("$luke has a $lightSaberColor lightsaber and drives a $vehicle and is $age years old.")

    println("Luke's full name $luke has ${luke.length} characters.")  //$ is used in PHP!
}
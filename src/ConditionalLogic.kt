fun main(args: Array<String>) {
    val a = 2
    val b = 3

    if (a == b) {
        println("a does in fact equal b")
    }

    if (a != b) {
        println("a does not actually equal b")
    }

    val accountBalance = 100
    val price = 150

    if (accountBalance >= price) {
        println("You can buy this.")
    }
    else {
        println("Sorry you are BROKE")
    }

    val degrees = 49

    if (degrees >= 70) {
        println("This is some nice weather!")
    }
    else if (degrees < 70 && degrees >= 50) {
        println("Grab a sweater")
    }
    else {
        println("Holy crap it is cold")
    }

    val isHungry = false
    val isBored = true

    if (isHungry || isBored) {
        println("Lets get some pizza!")
    }
    else {

    }

    val x = 44

    when (x) {
        1 -> println("x is 1")
        2 -> println("x is 2")
        else -> print("x is something else")
    }

    fun vaderIsFeeling(mood: String = "Angry") {
        if (mood == "Angry") {
            println("run for the hills! Vader is $mood")
        }
        else {
            println("what ever you do, don't make him angry!")
        }
    }

    vaderIsFeeling("Sleepy")
    vaderIsFeeling("Angry")
    

}
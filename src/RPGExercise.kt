open class Player(val name: String, val age: String, val gender: String) {
    fun attack() {
        println("WHAP BOOM BANG!")
    }
    fun defend() {
        println("Player defends!  Parry!")
    }
    fun walk() {
        println("Doo Doo Doooo. Do Do Do, do do do, do Doooooooo")
    }
}

class DragonWarrior(name: String, age: String, gender: String, val hitPoints: String) : Player(name, age, gender) {
    fun status() {
        println("You have $hitPoints HP")
    }
}

class Companion(name: String, age: String, gender: String, val level: Int) : Player (name, age, gender) {
    fun levelUp() {
        val newLevel = level + 1
        println("$name leveled up to $newLevel")
    }
}

fun main(args: Array<String>) {
    val mainPlayer = DragonWarrior("Matt", "37", "male", "2750")
    mainPlayer.attack()
    mainPlayer.defend()
    mainPlayer.status()

    val comp = Companion("Amy", "45", "female warrior",70)
    comp.attack()
    comp.levelUp()
}
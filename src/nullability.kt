fun main(args: Array<String>) {
    var name: String = "JonnyB"
    //name = null

    var nullableName: String? = "Do I really exist?"

    //nullableName = null
    //null check
    var length = 0
    if (nullableName != null) {
        length = (nullableName.length)
    } else {
        length = -1
    }
    println(length)

    val l = if (nullableName != null) nullableName.length else -1

    // safe call operator
    println(nullableName?.length)

    // elvis operator
    val len = nullableName?.length ?: -1  // like the ?? in swift
    val noName = nullableName ?: "No one knows me..."

    println(noName)

    // !! for null pointer exceptions.  force unwrapping!
    println(nullableName!!.length)
}
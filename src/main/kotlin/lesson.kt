fun main() {
    var num = 10
    println("num = $num")
    println(num::class)

    var str = "Hello"
    println(str)
    println(str::class)

    num = 20
    println("num = $num")

    val x = 10
}
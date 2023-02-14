fun main() {
//    val num = calcSquareArea(5)
    val num = calcSquareArea(width = 10)
    println(num)
}

//fun calcSquareArea(height: Int, width: Int  = 5 ) = height * width
fun calcSquareArea(height: Int = 5 , width: Int) = height * width
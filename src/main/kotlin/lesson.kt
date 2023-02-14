fun main() {
//    val (sum , max) = sumMax(20, 10, 50, 30, 40)
//    val (sum , _) = sumMax(20, 10, 50, 30, 40)
    val pair: Pair<Int, Int> = sumMax(20, 10, 50, 30, 40)

//    println(sum)
//    println(max)
    println(pair)
    println(pair.first)
    println(pair.second)
}

fun sumMax(vararg array: Int): Pair<Int, Int> {
    var sum = 0
    var max = 0

    for(num in array) {
        sum += num
        if (max < num) {
            max = num
        }
    }
    return Pair(sum, max)
}
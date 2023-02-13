fun main() {

    // 範囲演算子の学習

    val n1: Int = 10
    val n2: Int = 20

    val array: Array<Int> = arrayOf(n1, n2)

    println(15 in n1..n2)
    println(15 !in n1..n2)
    println(5 !in array)

    println("B" in "ABC")

}
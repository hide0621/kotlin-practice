fun main() {
    var str : String? = null
    println(str?:"".length)

    val list : MutableList<Int> = mutableListOf(10, 20, 30)
    val num : Int? = list.min()

//    println(num * 2)

//    val num2 : Int = num

    // スマートキャスト
    if (num != null) {
        println(num * 2)
    }

    // !!
    val num2 : Int = num!!
    println(num2 * 2)
}
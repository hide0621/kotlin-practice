fun main() {
//    println(union(1, 2, 3, 4))

    var intArray = intArrayOf(1, 2, 3, 4)
    // スプレッド演算子（*intArray）
    println(union(1, 2, 3, 4))
}

fun union(vararg array : Int): String {

    var str = ""
    for (num in array) {
        str += num
    }

    return str
}


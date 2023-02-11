fun main() {
    val array : Array<Int> = arrayOf(10, 20, 30)
//    println(array[0])
//    array[0] = 100
//    println(array[0])
    array.forEach { println(it) } // ラムダ式

    val array2 : IntArray = intArrayOf(10, 20)

    val array3: Array<String?> = arrayOfNulls<String>(5)
    array3.forEach { println(it) } // ラムダ式
}
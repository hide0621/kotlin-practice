fun main() {

    val list: MutableList<Int> = mutableListOf(10, 20, 30)
    println(list[0])

    list[0] = 100

    println(list[0])

    println(list)

    list.add(200)
    println(list)

    // インデックス番号０に追加（上書きではない）
    list.add(0, 500)
    println(list)

    list.removeAt(0)
    println(list)

    list.remove(100)
    println(list)
}
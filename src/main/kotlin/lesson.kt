fun main() {

//    val array = arrayOf("りんご", "みかん", "ぶどう")
//
//    for(fruits in array) {
//        println(fruits)
//    }

//    val list = listOf("東京", "大阪", "福岡")
//    for ((index, place) in list.withIndex()) {
//        println("$index = $place")
//    }

//    for (index in list.indices) {
//        println(index)
//        println(list[index])
//    }

    val map = mapOf<Int, String>(
        1 to "one",
        2 to "two",
        3 to "three"
    )

//    for(data in map) {
//        println(data)
//    }
    for((key, value) in map) {
        println("$key = $value")
    }

}
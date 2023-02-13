fun main() {

    val map: MutableMap<String, String> = mutableMapOf<String, String>(
            "orange" to "オレンジ",
            "melon" to "メロン",
            "apple" to "アップル"
    )

    println(map)

    map["apple"] = "リンゴ"
    println(map)

    map["banana"] = "バナナ"
    println(map)

    map.remove("apple")
    println(map)

}
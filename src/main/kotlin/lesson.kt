fun main() {

//    val str = sayMessage("hoge")
//    println(str)

    val str = unionString("藤原", "秀之")
    println(str)
}

//fun sayMessage(str: String): String {
//    return "Message = $str"
//}

//fun unionString(str1: String, str2: String): String {
//    return str1 + str2
//}

// 単一式関数（処理が一行のみの関数）
//fun unionString(str1: String, str2: String): String = str1 + str2
fun unionString(str1: String, str2: String) = str1 + str2


fun main() {

    val num: Any = 30.0

//    when(num) {
//        5 -> println("num = 5")
//        6,7 -> println("num = 6 or 7")
//        in 11..20 -> println("num = 11 ~ 20")
//        else -> {
//            println("その他")
//            println("当てはまるものなし！")
//        }
//    }

//    val str: String = when(num) {
//        5 -> "num = 5"
//        6,7 -> "num = 6 or 7"
//        in 11..20 -> "num = 11 ~ 20"
//        else -> {
//            println("その他")
//            "当てはまるものなし！"
//        }
//    }
//
//    println(str)

    val str: Any = when(num) {
        is Int -> "Int"
        is Double -> "Double"
        is String -> "String"
        else -> {
            println("当てはまるものなし！")
        }
    }
    println(str)
}
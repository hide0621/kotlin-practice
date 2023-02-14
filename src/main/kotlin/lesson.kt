fun main() {

    val num: Int = 49

//    if (num > 100) {
//        println("num > 100")
//    } else if (num > 50) {
//        println("num > 50")
//    } else {
//        println("その他")
//    }

    val str: String = if (num > 100) {
        "num > 100"
    } else if (num > 50) {
        "num > 50"
    } else {
        "その他"
    }

    println("strは${str}です")

}
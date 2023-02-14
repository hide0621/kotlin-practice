import kotlin.reflect.KFunction2

fun main() {
//    val func: KFunction2<Int, Int, Int> = ::calcA
//    println(func(10, 5))
//    val n1 = calcB(5, 10, ::calcA)
//    println("n1 = $n1")

//    val n2 = calcB(5, 10, {x: Int, y: Int -> x + y})
//    val n2 = calcB(5, 10){x: Int, y: Int -> x + y}
//    println("n2 = $n2")

//    val num = funcB(10, ::funcA)
//    val num = funcB(10) { x: Int -> x + 1 }
    val num = funcB(10){it + 1}
    println(num)
}

//fun calcA(a: Int, b: Int): Int = a + b

//fun calcB(a: Int, b: Int, func: (Int, Int) -> Int) = func(a, b)

fun funcA(a: Int) = a + 1

fun funcB(a: Int, func: (Int) -> Int) = func(a)
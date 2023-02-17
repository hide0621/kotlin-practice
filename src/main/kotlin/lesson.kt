import model.*
import model.Character
import model.Character as ch
fun main() {

    val f1 = Fruits("りんご", 100)
    val f2 = Fruits("りんご", 100)

    f1.area = "青森"
    f2.area = "長崎"

//    println(f1)
//    println(f1.area)
//    println(f2.area)
//
//    println(f1 == f2)

//    val f3 = f1.copy(price = 200)
//    println(f3)

//    val name = f1.component1()
//    println(name)
//
//    val price = f1.component2()
//    println(price)

    val(name, price) = f1
    println(name)
    println(price)

}


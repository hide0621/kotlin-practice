import model.*
import model.Character
import model.Character as ch
fun main() {

    val outer = Outer(10)
    outer.display()
    println()

    outer.innerCreate(20)
    outer.obj.display()
    println()

    val innerObj = outer.innerCreateReturn(30)
    innerObj.display()


}


import model.*
import model.Character
import model.Character as ch
fun main() {

//    val numList: List<Int> = listOf<Int>(1,2,3,4,5)
//    val x = getMiddle<Int>(numList)
//    println(x)

    val strList = listOf<String>("1","2" ,"3", "4", "5")
    println(getMiddle<String>(strList))

}

fun <T>getMiddle(list: List<T>): T{
    return list[list.size / 2]
}


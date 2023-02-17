import model.*
import model.Character
import model.Character as ch
fun main() {

    val day: Week = Week.Sunday
    println(day.value)
    println(day.ordinal)

    if (day == Week.Sunday) {
        println(true)
    }

    when(day) {
        Week.Sunday -> println(true)
        else -> {
            println("ほげ〜")
        }
    }

    for (week in Week.values()) {
        println("$week = ${week.value}")
    }

}


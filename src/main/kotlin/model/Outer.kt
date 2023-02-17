package model

class Outer(val num: Int) {

    lateinit var obj:Inner

    fun innerCreateReturn(num: Int):Inner {
        return Inner(num)
    }

    fun innerCreate(num: Int) {
        obj = Inner(num)
    }
    fun display() {
        println("Outer = $num")
    }

    inner class Inner(val num: Int) {
        fun display() {
            println("@Outer = ${this@Outer.num}")
            println("Inner = $num")
        }
    }
}
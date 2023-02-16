package model

open class Character(val name: String = "藤原", var hp: Int){

//    protected open fun showStatus() {
//        println("名前:${name}")
//        println("HP:${hp}")
//    }
    open fun showStatus() {
        println("名前:${name}")
        println("HP:${hp}")
    }
}

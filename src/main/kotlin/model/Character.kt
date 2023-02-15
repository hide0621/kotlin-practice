package model

open class Character(val name: String = "藤原", val hp: Int){

    fun showStatus() {
        println("名前:${name}")
        println("HP:${hp}")
    }
}

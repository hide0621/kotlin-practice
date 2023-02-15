
fun main() {

    val player = Character()
    player.showStatus()
}

class Character {
    var name: String = "主人公"
    var hp: Int = 100

    fun showStatus() {
        println("名前:${name}")
        println("HP:${hp}")
    }
}
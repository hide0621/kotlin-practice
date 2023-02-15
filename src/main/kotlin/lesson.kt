import model.Player
import model.Character as ch
fun main() {

    val player = Player("プレイヤー", 100, 10)
    player.attack()

    player.showStatus()

}


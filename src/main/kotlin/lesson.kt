import model.Character
import model.Enemy
import model.Player
import model.Character as ch
fun main() {

    val p = Player("プレイヤー", 100, 10, 10)

    p.showStatus()

    p.healing()

    p.showStatus()

}


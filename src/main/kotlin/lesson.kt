import model.Character
import model.Enemy
import model.Player
import model.Character as ch
fun main() {

    val p = Player("プレイヤー", 100, 10)
    val e = Enemy("エネミー", 50, 5)

    val list: List<Character> = listOf(p, e)

    for(obj: Character in list) {
        println("== ${obj::class} ==")
        obj.showStatus()
    }

}


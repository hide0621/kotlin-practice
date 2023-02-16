import model.Character
import model.Enemy
import model.Player
import model.Character as ch
fun main() {

    val p = Player("プレイヤー", 100, 10, 10)

    // アップキャスト
    val ch: Character = p
//    ch.showStatus()
//    ch.attack()

    // ダウンキャスト
    val player: Player = ch as Player
//    player.attack()

    // ダウンキャスの失敗例（ClassCastException）
//    val c = Character("藤原", 100)
//    val player1: Player = c as Player
    // 次の処理は失敗する
//    player1.attack()

    //　スマートキャスト
    if (ch is Player) {
        ch.attack()
//        val pp: Player =ch
    }

}


import model.Character as ch
fun main() {

    val p1 = ch("プレイヤー1", 100)
    p1.showStatus()

    val p2 = ch("プレイヤー2")
    p2.showStatus()

    val p3 = ch(500)
    p3.showStatus()

    val p4 = ch()
    p4.showStatus()
}


import model.AppInfo
import model.Character
import model.Enemy
import model.Player
import model.Character as ch
fun main() {

//    val weakPlayer = object : Player("モブ", 10, 1,1) {
//        override fun attack() {
//            println("失敗！！")
//        }
//    }
//    weakPlayer.attack()

    AppInfo.display()

    AppInfo.name = "ZZ GAME"
    AppInfo.display()

    println(KotlinVersion.CURRENT) // これでkotlinのバージョンを確認できる
}


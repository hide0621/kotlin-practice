import model.*
import model.Character
import model.Character as ch
fun main() {

//    val str: Generics<String> = Generics<String>("ABC")
//    str.display()
//
//    val int = Generics<Int>(100)
//    int.display()

    val p: Generics<Player> =
        Generics(Player("プレイヤー", 100, 10, 10))
    p.display()


}


package model

class Player(name: String, hp: Int, var atk: Int)
    : Character(name, hp) {

        fun attack() {
            println("${name}の攻撃！${atk}のダメージ！")
        }

        override fun showStatus() {
            println("名前:${name}")
            println("HP:${hp}")
            println("攻撃力:${atk}")
        }
}


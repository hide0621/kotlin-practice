package model

class Player(name: String, hp: Int, private var atk: Int, override var heal: Int)
    : Character(name, hp), Heal {

        fun attack() {
            println("${name}の攻撃！${atk}のダメージ！")
        }

//        public override fun showStatus() {
//            super.showStatus()
//            println("攻撃力:${atk}")
//        }
        override fun showStatus() {
            super.showStatus()
            println("攻撃力:${atk}")
        }

        override fun healing() {
            hp += heal
            println("HPを${heal}だけ回復しました")
        }
}


package model

class Generics<T: Character>(val value: T) {
    fun display() {
        value.showStatus()
    }
}

//class Generics<T: Player>(val value: T) {
//    fun display() {
//        value.showStatus()
//    }
//}
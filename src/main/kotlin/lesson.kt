fun main() {

//    for(i in 0..10 ) {
//        if (i == 5) {
//            break
//        }
//        println(i)
//    }

//    for(i in 0..10 ) {
//        if (i%2 == 0) {
//            continue
//        }
//        println(i)
//    }

//    for (i in 0..10) {
//        for (j in 0..10) {
//            if (j == 5) {
//                break
//            }
//            print(j)
//        }
//        println()
//    }

    outer@for (i in 0..10) {
        for (j in 0..10) {
            if (j == 5) {
                break@outer
            }
            print(j)
        }
        println()
    }

}
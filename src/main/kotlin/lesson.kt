import model.*
import model.Character
import model.Character as ch
fun main() {

//    class C: Status(){}

    var status = StatusTest.Enabled
    status = StatusTest.Disabled
    status = StatusTest.Error

    var s: Status = Status.Enable
    s = Status.Disable
    s = Status.Error("Error: 001")

}


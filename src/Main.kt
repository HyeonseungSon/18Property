fun main() {
    val obj1 = TestClass1(100, 200)
    println("obj1.a1 : ${obj1.a1}") // getter, setter 둘 다 setting 되어 있는 property 는 under bar
    println("obj1.a2 : ${obj1.a2}")

    obj1.a1 = 1000
    println("obj1.a1 : ${obj1.a1}")
    // obj1.a2 = 2000 // val : 변경 불가

    println("---------------------------------")

    val obj2 = TestClass2()

    obj2.v1 = 100
    // obj2.v2 = 200 // val : setter X => Error

    println("obj.v1 : ${obj2.v1}")
    println("obj.v2 : ${obj2.v2}")

    obj2.v3 = 5000
    println("ob2.v3 : ${obj2.v3}")
}
class TestClass1 (var a1:Int, val a2:Int)  // 주 생성자 // {} 생략 가능

class TestClass2 () {
    var v1:Int = 0
    val v2:Int = 0
    var v3:Int = 100
        // get() = field
        get() {
            println("get 호출")
            return field
        }
        set(value) {
            println("set 호출")
            field = value
        }
}

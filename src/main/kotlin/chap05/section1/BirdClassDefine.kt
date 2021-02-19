package chap05.section1

class Bird { // ① 클래스의 정의
    // ② 프로퍼티(속성)
    var name: String = "mybird"
    var wing: Int = 2
    var beak: String = "short"
    var color: String = "blue"

    // ③ 메서드(함수)
    fun fly() = println("Fly wing: $wing")
    fun sing(vol:Int) = println("Sing vol: $vol")
}

fun main() {
    val coco = Bird()   // ④ 클래스의 생성자를 통한 객체의 생성
    coco.color = "blue" // ⑤ 객체의 프로퍼티에 값 할당

    println("coco.color: ${coco.color}")
    coco.fly()
    coco.sing(3)
}
package chap07.section2

class Outer {
    val ov = 5
    class Nested {
        val nv = 10
        fun greeting() = "[Nested] Hello ! $nv" // 외부의 ov에는 접근 불가
    }
    fun outside() {
        val msg = Nested().greeting()
        println("[Outer]: $msg, ${Nested().nv}")
    }
}

fun main() {
    // static처럼 객체 생성 없이 사용
    val output = Outer.Nested().greeting()
    println(output)

    // Outer.outside() // 오류! 외부 클래스의 경우는 객체를 생성해야함.
    val outer = Outer()
    outer.outside()
}
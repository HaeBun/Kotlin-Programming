package chap03.section5

fun main() {
    // 일반 표기법
    // val multi = 3.multifly(10)

    // 중위 표현법
    val multi = 3 multifly 10
    println("multi: $multi")
}

infix fun Int.multifly(x: Int): Int {
    return this * x
}
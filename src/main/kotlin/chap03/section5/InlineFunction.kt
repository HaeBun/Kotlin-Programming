package chap03.section5

fun main() {
    // 인라인 함수 shortFunc()의 내용이 복사되어 shortFunc으로 돌아감
    shortFunc(3) { println("First call: $it")}
    shortFunc(5) { println("Second call: $it")}
}

inline fun shortFunc(a: Int, out: (Int) -> Unit) {
    println("Before calling out()")
    out(a)
    println("After calling out()")
}
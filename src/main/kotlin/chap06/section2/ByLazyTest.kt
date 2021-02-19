package chap06.section2

class LazyTest {
    init {
        println("init block") // ②
    }

    val subject by lazy {
        println("lazy initialized")
        "Kotlin Programming"
    }
    fun flow() {
        println("not initialized") // ④
        println("subject one: $subject") // ⑤ 최초 초기화 시점!
        println("subject two: $subject") // ⑥ 이미 초기화된 값 사용
    }
}

fun main() {
    val test = LazyTest() // ①
    test.flow() // ③
}
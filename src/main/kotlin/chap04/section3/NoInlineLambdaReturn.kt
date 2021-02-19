package chap04.section3.noinline

fun main() {
    retFunc()
}

fun inlineLambda(a: Int, b: Int, out: (Int, Int) -> Unit) { // inline을 제거
    out(a, b)
}

fun retFunc() {
    println("start of retFunc")
    inlineLambda(13,3) lit@{ a, b -> // 람다식 블록의 시작 부분에 라벨을 지정
        val result = a + b
        if(result > 10) return@lit
        println("result: $result")
    } // 이 부분으로 빠져나감
    println("end of retFunc")
}
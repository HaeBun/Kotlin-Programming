package chap09.section4

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    val listPair = listOf(Pair("A", 300), Pair("B", 200), Pair("C", 100))
    val map = mapOf(11 to "Java", 22 to "Kotlin", 33 to "C++")

    // TODO ...
    // sumBy: 식에 의해 도출된 모든 요소를 합산
    println(listPair.sumBy { it.second })
}
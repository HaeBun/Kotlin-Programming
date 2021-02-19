package chap09.section4

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    val listPair = listOf(Pair("A", 300), Pair("B", 200), Pair("C", 100))
    val map = mapOf(11 to "Java", 22 to "Kotlin", 33 to "C++")

    // TODO...
    // none: 요소가 없으면 true, 있으면 false를 반환
    println("none: " + list.none())
    println("none: " + list.none { it > 6 }) // 6 이상은 없으므로 true를 반환

    // isEmpty/isNotEmpty: 컬렉션이 비어 있는지 아닌지 검사
    println(list.isEmpty())
    println(list.isNotEmpty())
}
package chap09.section4

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    val listPair = listOf(Pair("A", 300), Pair("B", 200), Pair("C", 100), Pair("D", 200))
    val listRepeated = listOf(2, 2, 3, 4, 5, 5, 6)

    // binarySearch: 요소에 대해 이진 탐색 후 인덱스 반환
    println("binarySearch: " + list.binarySearch(3))

    // find: 조건식을 만족하는 첫 번째 검색된 요소 반환, 없으면 null
    println("find: " + list.find { it > 3 })
}
package chap08.section2

import java.util.*

fun main() {
    val arr = arrayOf(8, 4, 3, 2, 5, 9, 1)
    // ① 오름차순, 내림차순으로 정렬된 일반 배열로 변환
    val sortedNums = arr.sortedArray()
    println("ASC: " + Arrays.toString(sortedNums))

    val sortedNumsDesc = arr.sortedArrayDescending()
    println("DEC: " + Arrays.toString(sortedNumsDesc))

    // ② 원본 배열에 대한 정렬
    arr.sort(1, 3) // sort(fromIndex, toIndex)
    println("ORI: " + Arrays.toString(arr))
    arr.sortDescending()
    println("ORI: " + Arrays.toString(arr))

    // ③ List로 반환
    val listSorted: List<Int> = arr.sorted()
    val listDesc: List<Int> = arr.sortedDescending()
    println("LST: " + listSorted)
    println("LST: " + listDesc)

    // ④ SortBy를 이용한 특정 표현식에 따른 정렬
    val items = arrayOf<String>("Dog", "Cat", "Lion", "Kangaroo", "Po")
    items.sortBy { item -> item.length }
    println(Arrays.toString(items))
}

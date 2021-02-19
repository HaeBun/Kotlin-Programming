package chap10.section3

import java.io.FileReader
import java.lang.Exception

fun main() {
    val path = "C:\\Users\\가족\\Desktop\\Over the Rainbow.txt"

    try {
        val read = FileReader(path)
        println(read.readText())
    } catch (e: Exception) {
        println(e.message)
    }
}
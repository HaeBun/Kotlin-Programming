package chap10.section3

import java.io.IOException
import java.nio.file.Files
import java.nio.file.Paths
import java.nio.file.StandardOpenOption

fun main() {
    val path = "C:\\Users\\가족\\Desktop\\hello.txt" // 파일을 생성할 경로를 지정
    val text = "안녕하세요! Hello World!\n"

    try {
        Files.write(Paths.get(path), text.toByteArray(), StandardOpenOption.CREATE)
    } catch (e: IOException) {
    }
}
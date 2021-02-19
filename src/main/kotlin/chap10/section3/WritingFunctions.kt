package chap10.section3

import java.io.File
import java.io.PrintWriter

fun main() {
    val outString: String = "안녕하세요!\tHello\r\nWorld!." // ① 문자열의 구성
    val path = "C:\\Users\\가족\\Desktop\\testfile.txt"

    val file = File(path)
    val printWriter = PrintWriter(file)

    printWriter.println(outString) // ② 파일에 출력
    printWriter.close()
}
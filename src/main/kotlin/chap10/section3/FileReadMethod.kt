package chap10.section3

import java.io.*

fun main() {
    val path = "C:\\Users\\가족\\Desktop\\Over the Rainbow.txt"

    val file = File(path)
    val inputStream: InputStream = file.inputStream()
    val inputStringReader = InputStreamReader(inputStream)
    val sb = StringBuilder()
    var line: String?
    val br = BufferedReader(inputStringReader)
    try {
        line = br.readLine()
        while (line != null) {
            sb.append(line, '\n')
            line = br.readLine()
        }
        println(sb)
    } catch (e:Exception) {

    } finally {
        br.close()
    }
}
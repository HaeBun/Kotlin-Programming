package chap10.section1

import java.io.File
import java.io.FileOutputStream
import java.io.PrintWriter

fun main() {
    PrintWriter(FileOutputStream("C:\\Users\\home\\Desktop\\output.txt")).use {
        it.println("hello")
    }
}
package chap03.section1

fun main() {
    normalVarargs(1, 2, 3, 4) // 4개의 인자 구성
}

fun normalVarargs(vararg counts: Int) {
    for (num in counts) {
        print("$num ")
    }
    print("\n")
}
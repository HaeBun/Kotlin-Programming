package chap10.section1

fun main() {
    data class Person(var name: String, var Skills : String)
    var person = Person("Kildong", "Kotlin")
    val a = person.let {
        it.Skills = "Android"
        "Success" // 마지막 문장을 결과로 반환
    }
    println(person)
    println("a: $a")
    val b = person.also {
        it.Skills = "Java"
        "Success" // 마지막 문장은 사용되지 않음
    }
    println(person)
    println("b: $b") // Person의 객체 b
}
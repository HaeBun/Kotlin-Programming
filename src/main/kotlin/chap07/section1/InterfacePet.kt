package chap07.section1

interface Pet {
    var category: String // abstract 키워드가 없어도 기본은 추상 프로퍼티
    val msgTags: String
        get() = "I'm your lovely pet!"

    var species: String // 종을 위한 프로퍼티

    fun feeding() // 마찬가지로 추상 메서드
    fun patting() {// 일반 메서드: 구현부를 포함하면 일반적인 메서드로 기본이 됨
        println("Keep patting!") // 구현부
    }
}

class Cat(name: String, override var category: String) : Pet, Animal(name) {
    override var species: String = "cat" // 프로퍼티를 오버라이딩해 종을 특정
    override fun feeding() {
        println("Feed the cat a tuna can!")
    }
}

fun main() {
    val obj = Cat("Coco","small")
    println("Pet Category: ${obj.category}")
    obj.feeding() // 구현된 메서드
    obj.patting() // 기본 메서드
}
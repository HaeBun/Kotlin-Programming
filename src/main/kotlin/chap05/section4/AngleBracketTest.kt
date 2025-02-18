package chap05.section4

open class A {
    open fun f() = println("A Class f()")
    fun a() = println("A Class a()")
}

interface B {
    fun f() = println("B Interface f()") // 인터페이스는 기본적으로 open임
    fun b() = println("B Interface b()")
}

class C : A(), B { // ① 쉼표(,)를 사용해 클래스와 인터페이스를 지정
    // 컴파일되려면 f()가 오버라이딩되어야 함
    override fun f() = println("C Class f()")

    fun test(){
        f() // ② 현재 클래스의 f()
        b() // ③ 인터페이스 B의 b()
        super<A>.f() // ④ A 클래스의 f()
        super<A>.a() // ⑤ B 클래스의 a()
    }
}

fun main() {
    val c = C()
    c.test()
}

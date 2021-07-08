open class Father {
    open fun foo() = "Father"
}

class Child : Father() {
    // This is wrong because not liskov substitution principle
    /*override fun foo(): String = 21*/
}

fun main() {
    val child = Child()
    println(child.foo())
}
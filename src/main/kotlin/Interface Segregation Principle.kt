interface Workable {
    fun code(): String
    fun test(): String
}

class Developer : Codable, Testable {
    override fun code() = "coding"
    override fun test() = "test in local"
}

class Tester : Testable {
    // This is wrong because not interface segregation principle
    /*override fun code() = throw IllegalArgumentException("cant code")*/
    override fun test() = "test in server"
}

class ProjectManagement {
    fun processCode(codable: Codable) = codable.code()
    fun processTest(testable: Testable) = testable.test()
}

//---------------------------------------------------------------------------

interface Codable {
    fun code(): String
}

interface Testable {
    fun test(): String
}

fun main() {
    val projectManagement = ProjectManagement()
    println(projectManagement.processTest(Developer()))
}
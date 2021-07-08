data class Student(private val name: String, private val age: Int) {
    fun foo() {
        println("foo")
    }

    // This is wrong because not single responsibility principle
    /*fun saveData() {
        println("save in database")
    }*/
}

//---------------------------------------------------------------------------

object Repository {
    fun saveData(student: Student) {
        println("$student save in database")
    }
}

fun main() {
    val student = Student("jakode", 21)
    student.foo()
    Repository.saveData(student)
}
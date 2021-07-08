data class User(private val username: String, private val password: String)
// This is wrong because not dependency inversion principle
/*class Database {
    fun save(user: User) {
        println("$user save")
    }
}*/

//---------------------------------------------------------------------------

interface DatabaseContract {
    fun save(user: User)
}

object MySQL : DatabaseContract {
    override fun save(user: User) {
        println("$user save; drive MySQL")
    }
}

object MongoDB : DatabaseContract {
    override fun save(user: User) {
        println("$user save; drive MongoDB")
    }
}

object Repo {
    fun save(user: User, databaseContract: DatabaseContract) {
        databaseContract.save(user)
    }
}

fun main() {
    Repo.save(User(username = "Jakode", password = "123456"), MongoDB)
}
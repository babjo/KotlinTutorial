package _3_multi_declarations_data_clesses


data class User1(val name: String, val id: Int)

fun main(args: Array<String>) {
    var user = User1("Alex", 1)
    println(user)

    var secondUser = User1("Alex", 1)
    var thirdUser = User1("Max", 2)

    println("user == secondUser: ${user == secondUser}")
    println("user == thirdUser : ${user == thirdUser}")

    println(user.copy())
    println(user.copy("Max"))
    println(user.copy(id = 2))
    println(user.copy("Max", 2))

}


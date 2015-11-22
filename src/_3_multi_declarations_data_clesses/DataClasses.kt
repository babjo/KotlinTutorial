package _3_multi_declarations_data_clesses

/**
 * Created by Administrator on 2015-11-22.
 */

data class User(var name: String, val id: Int)

fun getUser(): User{
    return User("Alex", 1)
}

fun main(args: Array<String>){
    var user = getUser()
    println("name = ${user.name}, id = ${user.id}")

    var (name, id) = getUser()
    println("name = ${name}, id = ${id}")

    println("name = ${getUser().component1()}, id = ${getUser().component2()}")

}

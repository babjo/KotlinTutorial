package _4_delegated_properties

import kotlin.properties.Delegates

/**
 * Created by Administrator on 2015-11-22.
 */

class User3 {
    var name: String by Delegates.notNull()

    fun init(name: String) {
        this.name = name
    }
}

fun main(args: Array<String>) {
    val user = User3()
    println(user.name) // -> NotNull 걸어줘서 초기화하지 않고 호출시 예외 던짐
    user.init("Carl")
    println(user.name)
}
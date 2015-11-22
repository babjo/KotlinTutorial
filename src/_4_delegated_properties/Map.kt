package _4_delegated_properties

import kotlin.properties.Delegates

/**
 * Created by Administrator on 2015-11-22.
 */

// map 으로 프로퍼티 사용하는 방법
class User(val map: Map<String, Any?>) {
    val name: String by Delegates.mapVal(map) { thisRef, desc ->  "" } // 초기화
    val age: Int     by Delegates.mapVal(map) { thisRef, desc ->  1 }
}

fun main(args: Array<String>) {
    val user = User(mapOf(
            "name" to "John Doe",
            "age"  to 25
    ))

    println("name = ${user.name}, age = ${user.age}")

    val user2 = User(mapOf())

    println("name = ${user2.name}, age = ${user2.age}")
}

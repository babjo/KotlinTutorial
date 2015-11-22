package _4_delegated_properties

import kotlin.properties.Delegates

/**
 * Created by Administrator on 2015-11-22.
 */

class User2 { // 초기화 값 넣고, 값이 바뀔시 출력하도록.
    var name: String by Delegates.observable("no name") {
        d, old, new ->
        println("$old - $new")
    }
}

fun main(args: Array<String>) {
    val user = User2()
    user.name = "Carl"
}

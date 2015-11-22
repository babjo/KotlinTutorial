package _4_delegated_properties

import kotlin.reflect.KProperty

/**
 * Created by Administrator on 2015-11-22.
 */

// Example의 getter, setter를 위임
fun main(args: Array<String>) {
    val e = Example()
    println(e.p)
    e.p = "NEW"
}

class Example {
    var p: String by Delegate()

    override fun toString() = "Example Class"
}

class Delegate() {
    operator fun getValue(thisRef: Any?, prop: KProperty<*>): String {
        return "$thisRef, thank you for delegating '${prop.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, prop: KProperty<*>, value: String) {
        println("$value has been assigned to ${prop.name} in $thisRef")
    }
}

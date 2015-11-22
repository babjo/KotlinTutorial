package _3_multi_declarations_data_clesses

/**
 * Created by Administrator on 2015-11-22.
 */

fun main(args: Array<String>){
    var pair = Pair(1, "one")
    var (num, name) = pair
    println("num = $num, name = $name")
}

class Pair<K, V>(var first: K, val second:V){
    operator fun component1(): K {
        return first
    }

    operator fun component2(): V {
        return second
    }
}
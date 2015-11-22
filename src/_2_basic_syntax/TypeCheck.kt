package _2_basic_syntax

/**
 * Created by Administrator on 2015-11-22.
 */

fun main(args : Array<String>){
    println(getStringLength("aaa"))
    println(getStringLength(1))
}

fun getStringLength(obj: Any): Int? {
    if(obj is String)
        return obj.length
    return null
}

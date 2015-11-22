package _2_basic_syntax

/**
 * Created by Administrator on 2015-11-22.
 */

fun main(args: Array<String>){
    val x = 3

    var y = 10
    if(x in 1..y - 1) // in 이 사이값중에 있는가
        println("OK")

    var array = arrayListOf<String>()
    array.add("aaa")
    array.add("bbb")
    array.add("ccc")

    if(x !in 0..array.size-1)
        println("Out: array has only ${array.size} elements. x = ${x}")

    if ("aaa" in array)
        println("Yes: array contains aaa")

    if ("ddd" in array)
        println("Yes: array contains ddd")
    else
        println("No: array doesn't contains ddd")
}

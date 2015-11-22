package _2_basic_syntax

/**
 * Created by Administrator on 2015-11-22.
 */

fun main(args: Array<String>){
    cases("Hello")
    cases(1)
    cases(System.currentTimeMillis())
    cases(MyClass())
    cases("hello")
}

fun cases(obj: Any){
    when(obj){
        1 -> println("One") // 1 이면
        "Hello" -> println("Greeting") // "Hello" 면
        is Long -> println("Long") // Long 타입이면
        !is String -> println("Not a string") // String 타입이 아니면
        else -> println("Unknown") // 아예 없는 케이스면
    }
}

class MyClass(){

}
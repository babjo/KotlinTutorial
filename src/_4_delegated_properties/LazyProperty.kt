package _4_delegated_properties

/**
 * Created by Administrator on 2015-11-22.
 */


// 함수에 by lazy 붙이면 호출시. 그 때 계산
class LazySample {
    val lazy: String by lazy {
        println("computed!")
        "my lazy"
    }
}

fun main(args: Array<String>) {
    val sample = LazySample()
    println("lazy = ${sample.lazy}")
    println("lazy = ${sample.lazy}")
}
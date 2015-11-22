package _5_callable_references

/**
 * Created by Administrator on 2015-11-22.
 */

// 필터로 함수 거름. 홀수 인것만
fun main(args: Array<String>) {
    val numbers = listOf(1, 2, 3)
    println(numbers.filter(::isOdd))
}

fun isOdd(x: Int) = x % 2 != 0


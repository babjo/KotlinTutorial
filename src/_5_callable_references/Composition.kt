package _5_callable_references

/**
 * Created by Administrator on 2015-11-22.
 */

// 결국 길이가 홀수있는 얘들 걸러져.
fun main(args: Array<String>) {
    val oddLength = compose(::isOdd1, ::length)
    val strings = listOf("a", "ab", "abc")
    println(strings.filter(oddLength))
}

fun isOdd1(x: Int) = x % 2 != 0
fun length(s: String) = s.length

// 함수 앞에는 사용되는 변수 이름들 쓰고
// f: (B) -> C 이 말은 함수 f는 B 값을 넣으면 C가 나온다라는 의미
fun <A, B, C> compose(f: (B) -> C, g: (A) -> B): (A) -> C {
    return { x -> f(g(x)) } // 함수를 반환 x 입력을 f(g(x)) 하는 함수
}
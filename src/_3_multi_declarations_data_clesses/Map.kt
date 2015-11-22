package _3_multi_declarations_data_clesses

fun main(args: Array<String>) {

    var map = hashMapOf<String, Int>()
    map.put("one", 1)
    map.put("two", 2)

    for((key, value) in map){
        println("key = $key, value = $value")
    }
}
package hello_world

/**
 * Created by Administrator on 2015-11-22.
 */

class Greeter(var name : String){
    fun greet(){
        println("Hello, ${name}")
    }
}

fun main(args: Array<String>){
    Greeter(args[0]).greet()
}
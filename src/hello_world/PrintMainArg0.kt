package hello_world

/**
 * Created by Administrator on 2015-11-22.
 */


fun main(args: Array<String>){
    if(args.size == 0){
        println("Please provide a name as a command-line argument");
        return
    }
    println("Hello, ${args[0]}")
}
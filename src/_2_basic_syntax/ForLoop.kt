package _2_basic_syntax

/**
 * Created by Administrator on 2015-11-22.
 */

fun main(args: Array<String>){
    for(arg in args)
        println(arg)

    // 또는

    println()
    for(i in args.indices)
        println(args[i])
}

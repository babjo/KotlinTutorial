package _2_basic_syntax

/**
 * Created by Administrator on 2015-11-22.
 */

fun main(args: Array<String>){
    var x = 2;
    var y = 6;

    if(x != null && y!= null){
        print(x * y);
    }else{
        println("One of the arguments is null")
    }
}
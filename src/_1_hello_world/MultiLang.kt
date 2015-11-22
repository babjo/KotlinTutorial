package _1_hello_world



fun main(args: Array<String>){
    var lang = if(args.size == 0) "EN" else args[0]
    println(when(lang){
        "EN" -> "Hello!"
        "FR" -> "Salut!"
        else -> "Sorry, I can't greet you in $lang yet"
    })
}
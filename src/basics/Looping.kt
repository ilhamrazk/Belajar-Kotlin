package basics

fun main(args: Array<String>) {
    for (a:Int in 1..10){
        print("$a ")
    }

    println("\n")

    for (a in 1..5){
        println(a)
    }

    println()

    for (a in 10 downTo 1){
        print("$a ")
    }

    println()
    println()

    var i:Int = 0
    while (i < 10){
        i++
        print("$i ")
    }

    println()
    println()

    var j:Int = 10
    while (j > 0){
        j--
        print("$j ")
    }

    println()
    println()

    for (a in 0..100 step 5){
        print("$a ")
    }

    println()
    println()

    val cities = listOf("Jakarta","Malang","Surabaya","Bandung","Batam")
    for (city in cities){
        println(city)
    }
}
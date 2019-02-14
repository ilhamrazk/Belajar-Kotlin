package functions

/**
 * @author Ilham Harazki
 */

/** Main 1 */
fun main(args: Array<String>) {
    hello()
    println("result ${kaliDua(number = 2)}")
}

fun hello(){
    println("Hello world")
}

fun kaliDua(number:Int) :Int{
    return 2*number
}

/**
 * Hapus comment satu persatu satu ya, 1 main hanya bisa di jalankan dalam 1 proses
 */

/** Main 2 */
//fun main(args: Array<String>) {
//    println("Person Detail : ${personDetail("Pevite Pearce", 25)}")
//}
//
//fun personDetail(name:String, age:Int) : String{
//    return "name $name age $age"
//}

/** Main 3 */
//fun main(args: Array<String>) {
//    println("Person Detail 1 : ${personDetail(name = "Pevita Pearce", age = 25)}")
//    println("Person Detail 2 : ${personDetail("Isyana sarasvati", 24, "Bandung")}")
//    println("Person Detail 3 : ${personDetail(age = 27, name = "Raisa Adriana", address = "Jakarta")}")
//}
//
//fun personDetail(name:String, age:Int, address:String = "") : String{
//    return "name $name age $age address $address"
//}

/** Main 4 */
//fun main(args: Array<String>) {
//    printCities("Malang","Surabaya")
//    println()
//    printCities("Jakarta","Bandung","Bogor","Indramayu")
//}
//
//fun printCities(vararg cities: String){
//    for (city in cities){
//        print("$city ")
//    }
//}
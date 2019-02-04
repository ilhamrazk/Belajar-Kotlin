package basics

/**
 * @author Ilham Harazki
 *
 * Noted:
 * Hapus command terlebih dahulu ya (untuk cara hapusnya, cukup dengan memblok syntax lalu tekan (ctrl + /). Jangan lupa 1 main hanya bisa di run satu satu.
 * Jadi jangan hapus semua. Selamat mencoba :)
 */

/**
 * Main ke 1
 */
//fun main(args: Array<String>) {
//    val number:Int = 2
//    if (number > 0){
//        println("nomor lebih besar dari 0")
//    } else {
//        println("nomor kurang dari 0")
//    }
//}

/**
 * Main ke 2
 */
//fun main(args: Array<String>) {
//    val city:String = "Malang"
//
//    if (city.length < 0){
//        println("String is Empty")
//    }else if (city.length < 5){
//        println("String is short")
//    }else{
//        println("String is long")
//    }
//}

/**
 * main ke 3
 */

//fun main(args: Array<String>) {
//    val number:Int = 3
//
//    when(number){
//        1 -> println("number is 1")
//        2 -> println("number is 2")
//        3 -> println("number is 3")
//        4 -> println("number is 4")
//        else -> println("other number")
//    }
//}

/**
 * Main ke 4
 */

fun main(args: Array<String>) {
    val number:Int = 3

    val result = when(number){
        1 -> "number is 1"
        2 -> "number is 2"
        3 -> "number is 3"
        4 -> "number is 4"
        else -> "other number"
    }

    println("result : $result")
}
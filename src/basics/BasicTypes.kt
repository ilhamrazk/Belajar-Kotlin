package basics

fun main(args: Array<String>) {
    val myInteger   :Int    = 2
    val myDouble    :Double = 0.0983123
    val myLong      :Long   = 1000L
    val myFloat     :Float  = 37F

    println("my integer = $myInteger \n" +
            "my double  = $myDouble \n" +
            "my Long    = $myLong \n" +
            "my Float   = $myFloat \n")

    val myInteger2 : Int = 10
    val myInteger3 : Int = 2

    println("$myInteger2 - $myInteger3 = ${myInteger2.minus(myInteger3)}\n")

    val myBoolean : Boolean = true

    println("value myBoolean = $myBoolean")
    println("value no myBoolean = ${myBoolean.not()}\n")

    val myChar      : Char      = 'A'
    val myString    : String    = "Jalan Ahmad Yani"

    println("my char $myChar and my string $myString")
    println("my char code ${myChar.toInt()} and my string length ${myString.length}")
}


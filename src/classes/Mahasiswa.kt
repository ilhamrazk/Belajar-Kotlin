package classes

//class Mahasiswa {
//    var nim: String = ""
//    var nama: String = ""
//    var jurusan = ""
//}
//
//fun main(args: Array<String>) {
//
//    val mhs = Mahasiswa()
//    mhs.nim = "155150"
//    mhs.nama = "Alex Mahone"
//    mhs.jurusan = "Informatika"
//
//    println("Data Mahasiswa # ${mhs.nim}/${mhs.nama}/${mhs.jurusan}")
//}

//class Mahasiswa (val nim: String, var nama:String, val jurusan:String)
//
//fun main(args: Array<String>) {
//
//    val mhs = Mahasiswa("155150","Michael Scofield","Teknik arsitektur")
//    val mhs2 = Mahasiswa(jurusan = "Teknik keburonan", nim = "145140", nama = "Lincoln Burrows")
//
//    println("Data Mahasiswa 1 # ${mhs.nim}/${mhs.nama}/${mhs.jurusan}")
//    println("Data Mahasiswa 2 # ${mhs2.nim}/${mhs2.nama}/${mhs2.jurusan}")
//}

class Mahasiswa (val nim: String, var nama:String, val jurusan:String){

    var mhsEmail:String = ""

    init {
        nama = nama.toUpperCase()
    }

    constructor(nim:String, nama:String, jurusan:String, email:String) : this(nim, nama, jurusan){
        mhsEmail = email
    }
}

fun main(args: Array<String>) {

    val mhs = Mahasiswa("155150","Michael Scofield","Teknik arsitektur")
    val mhs2 = Mahasiswa("145140","Lincoln Burrows","Teknik keburonan", "lincolnburrows@yahoo.com")

    println("Data Mahasiswa 1 # ${mhs.nim}/${mhs.nama}/${mhs.jurusan}")
    println("Data Mahasiswa 2 # ${mhs2.nim}/${mhs2.nama}/${mhs2.jurusan}/${mhs2.mhsEmail}")
}
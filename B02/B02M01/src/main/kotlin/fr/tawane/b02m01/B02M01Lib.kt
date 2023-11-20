package fr.tawane.b02m01

import fr.tawane.b01m01.B01M01Lib

class B02M01Lib {

    fun getThree() = "3(${B01M01Lib().getOne()})"
}

fun main() {
    println(B02M01Lib().getThree())
}

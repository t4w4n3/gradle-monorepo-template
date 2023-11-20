package fr.tawane.b03m01

import fr.tawane.b01m01.B01M01Lib
import fr.tawane.b02m01.B02M01Lib

class B03M01Lib {

    fun getFive() = "5(${B01M01Lib().getOne()})(${B02M01Lib().getThree()})"
}

fun main() {
    println(B03M01Lib().getFive())
}

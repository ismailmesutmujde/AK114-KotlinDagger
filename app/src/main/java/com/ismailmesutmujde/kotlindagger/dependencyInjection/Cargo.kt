package com.ismailmesutmujde.kotlindagger.dependencyInjection

import android.util.Log

class Cargo {
    var address = Address("Sarıçam/Adana")
    fun send() {
        Log.e("Result", "Cargo was sent to ${address.addressInfo} address.")
    }
}
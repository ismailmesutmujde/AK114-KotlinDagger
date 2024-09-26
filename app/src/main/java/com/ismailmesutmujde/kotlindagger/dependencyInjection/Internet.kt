package com.ismailmesutmujde.kotlindagger.dependencyInjection

import android.util.Log

class Internet {
    var address = Address("Sarıçam/Adana")
    fun makeApplication() {
        Log.e("Result", "Internet application was made for ${address.addressInfo} address")
    }
}
package com.ismailmesutmujde.kotlindagger.dependencyInjection

import android.util.Log
import javax.inject.Inject

class Cargo @Inject constructor(var address: Address) {
    fun send() {
        Log.e("Result", "Cargo was sent to ${address.addressInfo} address.")
    }
}
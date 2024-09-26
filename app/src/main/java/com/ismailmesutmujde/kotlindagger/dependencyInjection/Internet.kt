package com.ismailmesutmujde.kotlindagger.dependencyInjection

import android.util.Log
import javax.inject.Inject

class Internet @Inject constructor(var address: Address) {
    fun makeApplication() {
        Log.e("Result", "Internet application was made for ${address.addressInfo} address")
    }
}
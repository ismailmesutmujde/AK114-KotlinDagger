package com.ismailmesutmujde.kotlindagger

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ismailmesutmujde.kotlindagger.dependencyInjection.Cargo
import com.ismailmesutmujde.kotlindagger.dependencyInjection.Internet


class MainActivity : AppCompatActivity() {

    private lateinit var cargo: Cargo
    private lateinit var internet: Internet

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cargo = Cargo()
        cargo.send()

        internet = Internet()
        internet.makeApplication()

    }
}
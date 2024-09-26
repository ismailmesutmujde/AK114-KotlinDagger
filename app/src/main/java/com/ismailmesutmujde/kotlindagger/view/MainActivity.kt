package com.ismailmesutmujde.kotlindagger.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ismailmesutmujde.kotlindagger.R
import com.ismailmesutmujde.kotlindagger.dependencyInjection.Cargo
import com.ismailmesutmujde.kotlindagger.dependencyInjection.DaggerAppComponent
import com.ismailmesutmujde.kotlindagger.dependencyInjection.Internet
import javax.inject.Inject


class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var cargo: Cargo
    @Inject
    lateinit var internet: Internet

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerAppComponent.builder().build().inject(this)
        cargo.send()
        internet.makeApplication()
    }
}
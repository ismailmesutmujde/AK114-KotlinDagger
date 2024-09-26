package com.ismailmesutmujde.kotlindagger.dependencyInjection

import com.ismailmesutmujde.kotlindagger.view.MainActivity
import dagger.Component

@Component(modules = [AppModule::class])
interface AppComponent {
    fun inject(activity: MainActivity)
}
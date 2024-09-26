package com.ismailmesutmujde.kotlindagger.dependencyInjection

import dagger.Module
import dagger.Provides

@Module
class AppModule {
    @Provides
    fun provideAddress() : Address {
        return Address("Sarıçam/ADANA")
    }
}
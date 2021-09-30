package com.codingwithjks.diyt.di.interfaces

import android.util.Log
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Singleton

interface DemoOne{
    fun demoOne()
}

class DemoImplementationOne @Inject  constructor(): DemoOne{
    override fun demoOne() {
        Log.d("main", "demoOne is calling..")
    }
}

class MainOne @Inject constructor(private val demoOne: DemoOne){
    fun demoOne(){
        demoOne.demoOne()
    }
}

@Module
@InstallIn(SingletonComponent::class)
abstract class AppModule2{


    @Binds
    @Singleton
    abstract fun providesOne(
        demoImplementationOne: DemoImplementationOne
    ):DemoOne

}

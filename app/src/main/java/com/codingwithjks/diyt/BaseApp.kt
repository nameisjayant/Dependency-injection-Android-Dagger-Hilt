package com.codingwithjks.diyt

import android.app.Application
import com.codingwithjks.diyt.di.Car
import com.codingwithjks.diyt.di.Engine
import com.codingwithjks.diyt.di.Wheel
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class BaseApp : Application(){

    var car = Car(Engine(), Wheel())

    // val computer = Computer()

}
package com.codingwithjks.diyt

import android.app.Application
import com.codingwithjks.diyt.di.Car
import com.codingwithjks.diyt.di.Engine
import com.codingwithjks.diyt.di.Wheel

class BaseApp : Application(){

    var car = Car(Engine(), Wheel())

}
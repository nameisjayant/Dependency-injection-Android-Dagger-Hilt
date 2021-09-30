package com.codingwithjks.diyt.di

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Computer @Inject constructor(val ram: Ram,val hardDisk: HardDisk) {

    fun getComputer(){
        ram.getRam()
        hardDisk.getHardDisk()
        Log.d("main", "getComputer: ")
    }
}

@Singleton
class Ram @Inject constructor() {

    fun getRam(){
        Log.d("main", "getComputer: ")
    }
}

@Singleton
class HardDisk @Inject constructor() {

    fun getHardDisk(){
        Log.d("main", "getComputer: ")
    }
}

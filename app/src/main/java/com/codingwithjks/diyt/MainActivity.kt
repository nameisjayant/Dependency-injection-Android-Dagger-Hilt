package com.codingwithjks.diyt

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.codingwithjks.diyt.di.Computer
import com.codingwithjks.diyt.di.interfaces.ImplementOne
import com.codingwithjks.diyt.di.interfaces.Main
import com.codingwithjks.diyt.di.interfaces.MainOne
import com.codingwithjks.diyt.di.interfaces.MainTwo
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var computer: Computer
    @Inject
    lateinit var main: MainOne
    @Inject
    lateinit var mainTwo: MainTwo
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        computer.getComputer()
        main.demoOne()
        mainTwo.mainTwo()

    }
}
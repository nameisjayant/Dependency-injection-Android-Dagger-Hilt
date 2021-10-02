package com.codingwithjks.diyt

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.codingwithjks.diyt.Qualifiers.Test
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var test:Test
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        test.getNames()
    }
    companion object{
        val FName = "jayant"
        val LName = "kumar"
    }

}
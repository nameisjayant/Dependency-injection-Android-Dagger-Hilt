package com.codingwithjks.diyt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.codingwithjks.diyt.di.Computer
import com.codingwithjks.diyt.di.Downloader
import com.codingwithjks.diyt.di.DownloaderFactory
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var computer: Computer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        computer.getComputer()


    }
}
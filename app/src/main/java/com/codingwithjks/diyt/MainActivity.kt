package com.codingwithjks.diyt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.codingwithjks.diyt.di.Downloader
import com.codingwithjks.diyt.di.DownloaderFactory

class MainActivity : AppCompatActivity() {
    private lateinit var baseApp: BaseApp
    private val download = DownloaderFactory.create()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        baseApp = BaseApp()
        baseApp.car.getCar()

        download.getDownload()

    }
}
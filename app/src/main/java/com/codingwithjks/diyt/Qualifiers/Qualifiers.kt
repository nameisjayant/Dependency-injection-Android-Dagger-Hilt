package com.codingwithjks.diyt.Qualifiers

import android.content.Context
import android.util.Log
import android.widget.Toast
import com.codingwithjks.diyt.MainActivity
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ActivityContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Qualifier


class Test @Inject constructor(
    @FName
    val fName: String,
    @LName
    val lName: String,
    @ActivityContext
    val context:Context
) {

    fun getNames() {
        Log.d("main", "$fName $lName ")
        Toast.makeText(context,"Hello",Toast.LENGTH_SHORT).show()
    }

}

@Module
@InstallIn(SingletonComponent::class)
object Modules {

    @Provides
    @FName
    fun providesFName() = MainActivity.FName

    @Provides
    @LName
    fun providesLName() = MainActivity.LName

}

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class FName

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class LName
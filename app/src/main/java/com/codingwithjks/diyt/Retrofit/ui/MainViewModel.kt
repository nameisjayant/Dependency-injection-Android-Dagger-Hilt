package com.codingwithjks.diyt.Retrofit.ui

import androidx.lifecycle.ViewModel
import com.codingwithjks.diyt.Retrofit.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel
@Inject
constructor(private val mainRepository: MainRepository): ViewModel() {

    val data = mainRepository.getPosts()

}
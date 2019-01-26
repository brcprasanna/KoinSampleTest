package com.prasanna.koinsampletest

import android.arch.lifecycle.ViewModel
import com.prasanna.koinsampletest.HelloRepository

class MyViewModel(private val repo: HelloRepository): ViewModel() {
    fun sayHello() = "${repo.giveHello()} from $this"
}
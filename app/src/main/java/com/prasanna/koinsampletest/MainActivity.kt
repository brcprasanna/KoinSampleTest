package com.prasanna.koinsampletest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import org.koin.android.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    // Lazy Inject ViewModel
    private val myViewModel: MyViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, myViewModel.sayHello(), Toast.LENGTH_LONG).show()
    }
}

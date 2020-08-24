package com.anggastudio.mysimplecleanarchitecture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.anggastudio.mysimplecleanarchitecture.presentation.MainViewModel
import com.anggastudio.mysimplecleanarchitecture.presentation.MainViewModelFactory
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel = obtainViewModel();

        viewModel.getMessage("Dicoding")
        viewModel.message.observe(this, { tvWelcome.text = it.welcomeMessage })
    }

    private fun obtainViewModel(): MainViewModel {
        val factory = MainViewModelFactory.getInstance() as ViewModelProvider.Factory
        return ViewModelProvider(this, factory)[MainViewModel::class.java]
    }
}
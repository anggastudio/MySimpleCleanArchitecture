package com.anggastudio.mysimplecleanarchitecture.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.anggastudio.mysimplecleanarchitecture.R
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
        val factory = MainViewModelFactory.getInstance()
        return ViewModelProvider(this, factory)[MainViewModel::class.java]
    }
}
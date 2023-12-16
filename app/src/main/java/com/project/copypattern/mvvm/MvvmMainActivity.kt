package com.project.copypattern.mvvm

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.project.copypattern.databinding.ActivityLoginBinding

class MvvmMainActivity : AppCompatActivity() {
    private val binding: ActivityLoginBinding by lazy {
        ActivityLoginBinding.inflate(layoutInflater)
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }
}
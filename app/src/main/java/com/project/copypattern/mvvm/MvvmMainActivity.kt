package com.project.copypattern.mvvm

import android.database.Observable
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.project.copypattern.R
import com.project.copypattern.databinding.ActivityLoginBinding

class MvvmMainActivity : AppCompatActivity() {
    private val binding: ActivityLoginBinding by lazy {
        ActivityLoginBinding.inflate(layoutInflater)
    }

    private lateinit var loginViewModel: LoginViewModel

    private val loginObserver = Observer<Boolean> {
        if (it) {
            Toast.makeText(this@MvvmMainActivity, "success", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this@MvvmMainActivity, "fail", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.tvTitle.setText(R.string.mvvm)
        binding.includeLogin.btnLogin.setOnClickListener {
            loginViewModel.login(
                binding.includeLogin.etId.text.toString(),
                binding.includeLogin.etPass.text.toString(),
            )
        }// 로그인 버튼

        loginViewModel = ViewModelProvider(this)[LoginViewModel::class.java]
        loginViewModel.isLoginSuccessfulFlag.observe(this, loginObserver)

    }
}
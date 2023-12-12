package com.project.copypattern.mvp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.project.copypattern.R
import com.project.copypattern.databinding.ActivityLoginBinding
import com.project.copypattern.mvp.presenter.LoginPresenterImpl

class MvpMainActivity : AppCompatActivity(), LoginView {

    private val binding: ActivityLoginBinding by lazy {
        ActivityLoginBinding.inflate(layoutInflater)
    }
    private lateinit var loginPresenterImpl: LoginPresenterImpl
    override val name: String
        get() = binding.includeLogin.etId.text.toString()
    override val pass: String
        get() = binding.includeLogin.etPass.text.toString()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.tvTitle.setText(R.string.mvp)
        loginPresenterImpl = LoginPresenterImpl(this)

        binding.includeLogin.btnLogin.setOnClickListener {
            loginPresenterImpl.login()
        }
    }

    override fun login(isSuccess: Boolean) {
        if (isSuccess) {
            Toast.makeText(this, "success", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "fail", Toast.LENGTH_SHORT).show()
        }
    }
}
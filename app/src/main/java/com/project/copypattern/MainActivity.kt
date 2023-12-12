package com.project.copypattern

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.project.copypattern.databinding.ActivityLoginBinding

class MainActivity : AppCompatActivity() {
    private val binding: ActivityLoginBinding by lazy {
        ActivityLoginBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.includeLogin.btnLogin.setOnClickListener {
            login()
        }

    }

    private fun login() {
        val inputId = binding.includeLogin.etId.text.toString()
        val inputPass = binding.includeLogin.etPass.text.toString()
        if (inputId == secretName && inputPass == secretPass) {
            Toast.makeText(this@MainActivity, "success", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this@MainActivity, "fail", Toast.LENGTH_SHORT).show()
        }
    }

    companion object {
        const val secretName = "user"
        const val secretPass = "1234"
    }
}

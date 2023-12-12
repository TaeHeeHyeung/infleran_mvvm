package com.project.copypattern.mvc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.project.copypattern.R
import com.project.copypattern.databinding.ActivityLoginBinding

class MvcMainActivity : AppCompatActivity() {
    private val binding: ActivityLoginBinding by lazy {
        ActivityLoginBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.tvTitle.setText(R.string.mvc)
        val user = User()
        binding.includeLogin.btnLogin.setOnClickListener {
            if (user.login(binding.includeLogin.etId.text.toString(), binding.includeLogin.etPass.text.toString())) {
                Toast.makeText(this, "success", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "fail", Toast.LENGTH_SHORT).show()

            }
        }

    }
}
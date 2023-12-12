package com.project.copypattern.mvp.view

import com.project.copypattern.databinding.ActivityLoginBinding

interface LoginView {

    //에디트 텍스트 값
    val name: String
    val pass: String

    fun login(isSuccess: Boolean)
}
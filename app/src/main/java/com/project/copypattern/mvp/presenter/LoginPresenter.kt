package com.project.copypattern.mvp.presenter

import com.project.copypattern.mvp.model.User

interface LoginPresenter {
    val user: User

    fun login()
}
package com.project.copypattern.mvp.presenter

import com.project.copypattern.mvp.model.User
import com.project.copypattern.mvp.view.LoginView

class LoginPresenterImpl(
    private val loginView: LoginView
) : LoginPresenter {

    override val user: User
        get() = User()

    override fun login() {
        if (User.secretName == loginView.name && User.secretWord == loginView.pass) {
            user.name = loginView.name
            user.pass = loginView.pass
            loginView.login(true)
        } else {
            user.name = null
            user.pass = null
            loginView.login(false)
        }
    }
}
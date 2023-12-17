package com.project.copypattern.mvvm

data class User(
    var name: String? = null,
    var pass: String? = null
) {
    fun login(user: String?, password: String?): Boolean {
        return if (user.equals(secretName) && password.equals(secretWord)) {
            this.name = user;
            this.pass = password;
            true
        } else {
            this.name = null;
            this.pass = null;
            false
        }

    }

    companion object {
        const val secretName = "name"
        const val secretWord = "1234"
    }
}
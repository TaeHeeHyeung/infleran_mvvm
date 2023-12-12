package com.project.copypattern.mvp.model

data class User(
    var name: String? = null,
    var pass: String? = null
) {

    fun login(userName: String?, password: String?): Boolean {
        return if (userName == secretName && password == secretWord) {
            this.name = userName
            this.pass = password
            true
        } else {
            this.name = ""
            this.pass = ""
            false
        }
    }

    companion object {
        const val secretName = "user"
        const val secretWord = "1234"
    }

}

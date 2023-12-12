package com.project.copypattern.mvc

import android.widget.Toast

data class User(
    var name: String? = null,
    var pass: String? = null
) {
    fun login(name: String, pass: String): Boolean {
        return if (secretName == name && secretPass == pass) {
            this.name = name
            this.pass = pass
            true
        } else {
            this.name = null
            this.pass = null
            false
        }
    }

    companion object {
        const val secretName = "user"
        const val secretPass = "1234"
    }
}
package com.project.copypattern.mvvm.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.project.copypattern.mvvm.model.User

// 로그인 뷰모델
class LoginViewModel : ViewModel() {
    private val user: User = User()

    // 변경 가능한 상태 (로그인)
    // 외부에서 접근 불가능하게 prvate (동시 접근 불가)
    private val _isLoginSuccessfulFlag: MutableLiveData<Boolean> =
        MutableLiveData<Boolean>()

    //
    val isLoginSuccessfulFlag: LiveData<Boolean>
        get() = _isLoginSuccessfulFlag


    private fun setIsLoginSuccessfulFlag(isLoginSuccessFul: Boolean) {
        _isLoginSuccessfulFlag.postValue(isLoginSuccessFul)
    }

    fun login(userName: String?, password: String?) {
        val isLoginSuccess: Boolean = user.login(userName, password)
        if (isLoginSuccess) {
            setIsLoginSuccessfulFlag(true)
        } else {
            setIsLoginSuccessfulFlag(false)
        }
    }

}
package com.brfdev.testapplication.ui.screens.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.brfdev.testapplication.ui.domain.LoginUseCase
import kotlinx.coroutines.launch

class MainActivityViewModel(
//    private val loginUseCase: LoginUseCase, //if i was using dependency injection
): ViewModel() {

    private val _success = MutableLiveData<Boolean>()
    val success: LiveData<Boolean> = _success

    fun login(email: String, password: String){
        val loginUseCase = LoginUseCase()
        viewModelScope.launch {
            val result = loginUseCase.invoke(email, password)
            if(result){
                _success.value = true
            }
        }
    }
}
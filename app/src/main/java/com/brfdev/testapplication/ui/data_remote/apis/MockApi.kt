package com.brfdev.testapplication.ui.data_remote.apis

import kotlinx.coroutines.delay

class MockApi {

    suspend fun login(email: String, password: String): Boolean {
        val valid = email == "bruno@hotmail.com" && password == "1234"
        delay(2000)
        return valid
    }
}
package com.brfdev.testapplication.ui.data_remote

import com.brfdev.testapplication.ui.data.remote.RemoteDataSource
import com.brfdev.testapplication.ui.data_remote.apis.MockApi

class RemoteDataSourceImpl(
//    private val api: MockApi //if i was using dependency injection
): RemoteDataSource {

    override suspend fun login(email: String, password: String): Boolean {
        val loginApi = MockApi()
        return loginApi.login(email, password)
    }
}
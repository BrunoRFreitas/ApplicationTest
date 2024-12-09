package com.brfdev.testapplication.ui.data.remote

interface RemoteDataSource {

    suspend fun login(email: String, password: String): Boolean
}
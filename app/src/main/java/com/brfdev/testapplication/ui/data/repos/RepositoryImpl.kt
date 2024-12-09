package com.brfdev.testapplication.ui.data.repos

import com.brfdev.testapplication.ui.data.remote.RemoteDataSource
import com.brfdev.testapplication.ui.data_remote.RemoteDataSourceImpl
import com.brfdev.testapplication.ui.domain.repos.Repository

class RepositoryImpl(
//    private val remoteDataSource: RemoteDataSource //if i was using dependency injection
): Repository {

    override suspend fun login(email: String, password: String): Boolean {
        val repository: RemoteDataSource = RemoteDataSourceImpl()
        return repository.login(email, password)
    }
}
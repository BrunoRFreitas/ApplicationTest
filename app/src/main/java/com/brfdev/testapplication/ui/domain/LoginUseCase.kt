package com.brfdev.testapplication.ui.domain

import com.brfdev.testapplication.ui.data.repos.RepositoryImpl
import com.brfdev.testapplication.ui.domain.repos.Repository

class LoginUseCase(
//    private val respository: Repository //if i was using dependency injection
) {
    suspend fun invoke(email: String, password: String): Boolean{
        val repository: Repository = RepositoryImpl()
        return repository.login(email, password)
    }
}
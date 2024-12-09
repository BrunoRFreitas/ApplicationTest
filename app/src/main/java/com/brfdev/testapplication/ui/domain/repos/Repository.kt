package com.brfdev.testapplication.ui.domain.repos

interface Repository {

    suspend fun login(email: String, password: String): Boolean
}
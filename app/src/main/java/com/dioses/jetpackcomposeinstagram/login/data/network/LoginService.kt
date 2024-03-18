package com.dioses.jetpackcomposeinstagram.login.data.network

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

/****
 * Project: JetpackComposeInstagram
 * From: com.dioses.jetpackcomposeinstagram.core.network
 * Created by Arthur Dioses Reto on 15/03/24 at 1:51 AM
 * All rights reserved 2024.
 ****/
class LoginService @Inject constructor(private val loginClient: LoginClient) {

    suspend fun doLogin(user: String, password: String): Boolean {
        return withContext(Dispatchers.IO) {
            val response = loginClient.doLogin()
            response.body()?.success ?: false
        }
    }
}
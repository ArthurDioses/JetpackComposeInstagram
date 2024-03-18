package com.dioses.jetpackcomposeinstagram.login.data.network

import com.dioses.jetpackcomposeinstagram.core.network.RetrofitHelper
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

/****
 * Project: JetpackComposeInstagram
 * From: com.dioses.jetpackcomposeinstagram.core.network
 * Created by Arthur Dioses Reto on 15/03/24 at 1:51 AM
 * All rights reserved 2024.
 ****/
class LoginService {
    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun doLogin(user: String, password: String): Boolean {
        return withContext(Dispatchers.IO) {
            val response = retrofit.create(LoginClient::class.java).doLogin()
            response.body()?.success ?: false
        }
    }
}
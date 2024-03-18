package com.dioses.jetpackcomposeinstagram.login.data

import com.dioses.jetpackcomposeinstagram.login.data.network.LoginService
import javax.inject.Inject

/****
 * Project: JetpackComposeInstagram
 * From: com.dioses.jetpackcomposeinstagram.login
 * Created by Arthur Dioses Reto on 15/03/24 at 1:58 AM
 * All rights reserved 2024.
 ****/
class LoginRepository @Inject constructor(private val api: LoginService) {
    suspend fun doLogin(user: String, password: String): Boolean {
        return api.doLogin(user, password)
    }
}

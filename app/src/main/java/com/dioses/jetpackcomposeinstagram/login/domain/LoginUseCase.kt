package com.dioses.jetpackcomposeinstagram.login.domain

import com.dioses.jetpackcomposeinstagram.login.data.LoginRepository

/****
 * Project: JetpackComposeInstagram
 * From: com.dioses.jetpackcomposeinstagram.login.domain
 * Created by Arthur Dioses Reto on 15/03/24 at 2:01 AM
 * All rights reserved 2024.
 ****/
class LoginUseCase {
    val repository = LoginRepository()
    suspend operator fun invoke(user: String, password: String): Boolean {
        return repository.doLogin(user, password)
    }
}
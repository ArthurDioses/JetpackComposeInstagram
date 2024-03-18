package com.dioses.jetpackcomposeinstagram.login.data.network

import com.dioses.jetpackcomposeinstagram.core.network.response.LoginResponse
import retrofit2.Response
import retrofit2.http.GET

/****
 * Project: JetpackComposeInstagram
 * From: com.dioses.jetpackcomposeinstagram.login.data
 * Created by Arthur Dioses Reto on 15/03/24 at 1:37 AM
 * All rights reserved 2024.
 ****/
interface LoginClient {
    @GET("login")
    suspend fun doLogin(): Response<LoginResponse>
}
package com.dioses.jetpackcomposeinstagram.core.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/****
 * Project: JetpackComposeInstagram
 * From: com.dioses.jetpackcomposeinstagram.core.network
 * Created by Arthur Dioses Reto on 15/03/24 at 1:34 AM
 * All rights reserved 2024.
 ****/
object RetrofitHelper {
    fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://run.mocky.io/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}
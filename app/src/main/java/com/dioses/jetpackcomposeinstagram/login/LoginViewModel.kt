package com.dioses.jetpackcomposeinstagram.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/****
 * Project: JetpackComposeInstagram
 * From: com.dioses.jetpackcomposeinstagram.login
 * Created by Arthur Dioses Reto on 12/03/24 at 10:20 PM
 * All rights reserved 2024.
 ****/

class LoginViewModel : ViewModel() {
    private val _email = MutableLiveData<String>()
    val email: LiveData<String> = _email

    fun onLoginChanged(email: String) {
        _email.value = email
    }
}
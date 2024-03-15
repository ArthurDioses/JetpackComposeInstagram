package com.dioses.jetpackcomposeinstagram.core.network.response

import com.google.gson.annotations.SerializedName

/****
 * Project: JetpackComposeInstagram
 * From: com.dioses.jetpackcomposeinstagram.core.network.response
 * Created by Arthur Dioses Reto on 15/03/24 at 1:40 AM
 * All rights reserved 2024.
 ****/
data class LoginResponse(
    @SerializedName("success") val success: Boolean,
)

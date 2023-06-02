package com.example.launderagent.data.entities

import com.example.launderagent.other.Constants.DEFAULT_PROFILE_PICTURE
import com.google.firebase.firestore.IgnoreExtraProperties

@IgnoreExtraProperties
data class User(
    val uid: String = "",
    val email: String = "",
    val username: String = "",
    val profilePictureUrl: String = DEFAULT_PROFILE_PICTURE,
    val time: String = "",
    val phone: String = ""

)
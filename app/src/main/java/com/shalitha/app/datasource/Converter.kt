package com.shalitha.app.datasource

import com.shalitha.app.presentation.models.PUser
import com.shalitha.localdb.entities.User


fun PUser.mapToLocalUser(): User =
    User(
        firstName = firstName,
        secondName = secondName,
        password = passwordToken,
        email = email,
        id = null
    )
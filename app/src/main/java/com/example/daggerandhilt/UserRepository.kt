package com.example.daggerandhilt

import android.util.Log
import javax.inject.Inject

interface UserRepository{
    fun saveUser(email: String, password: String)
}


class SQLRepository @Inject constructor() : UserRepository{    //  This is called constructor injection
    override fun saveUser(email: String, password: String) {
        Log.d("saveUser:", "$email in DB")
    }
}

class FireBaseRepository :UserRepository{
    override fun saveUser(email: String, password: String) {
        TODO("Not yet implemented")
        Log.d("Fire", "saveUser: in fire base")
    }
}

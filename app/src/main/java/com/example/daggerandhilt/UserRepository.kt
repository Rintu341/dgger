package com.example.daggerandhilt

import android.util.Log
import javax.inject.Inject

interface UserRepository{
    fun saveUser(email: String, password: String)
}


class SQLRepository @Inject constructor() : UserRepository{    //  This is called constructor injection
    override fun saveUser(email: String, password: String) {
        Log.d("TAG", "$email in DB")
    }
}

class FireBaseRepository : UserRepository{
    override fun saveUser(email: String, password: String) {
        Log.d("TAG", "saveUser: in fire base")
    }
}

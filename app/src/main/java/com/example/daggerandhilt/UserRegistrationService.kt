package com.example.daggerandhilt

import android.util.Log
import javax.inject.Inject

class UserRegistrationService @Inject constructor(
    private val userRepository: UserRepository,
    private val notification:Notification
){
    fun registerUser(email: String, password: String) {
        userRepository.saveUser(email,password)
        notification.send(email,"soumita238@gmail.com","User Registered")
    }

}

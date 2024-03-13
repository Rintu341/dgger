package com.example.daggerandhilt

import android.util.Log
import javax.inject.Inject

class UserRegistrationService @Inject constructor(
    private val userRepository: UserRepository,
    private val notificationService:NotificationService
){
    fun registerUser(email: String, password: String) {
        userRepository.saveUser(email,password)
        notificationService.send(email,"soumita238@gmail.com","User Registered")
    }

}

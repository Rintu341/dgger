package com.example.daggerandhilt

import dagger.Component

@Component
interface UserRegistrationComponent {

    fun inject(mainActivity: MainActivity) // mainActivity is a consumer
}
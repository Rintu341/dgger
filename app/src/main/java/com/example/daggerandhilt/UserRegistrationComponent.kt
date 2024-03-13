package com.example.daggerandhilt

import dagger.Component

@Component(modules = [NotificationServiceModule::class,UserRepositoryServiceModule::class])
interface UserRegistrationComponent {

    fun inject(mainActivity: MainActivity) // mainActivity is a consumer
}
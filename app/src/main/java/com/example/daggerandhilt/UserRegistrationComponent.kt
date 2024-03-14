package com.example.daggerandhilt

import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton
@ApplicationScope
@Component(modules = [NotificationServiceModule::class,UserRepositoryServiceModule::class])
interface UserRegistrationComponent {

    fun inject(mainActivity: MainActivity) // mainActivity is a consumer

    fun getEmailService():EmailService
    @Component.Factory
    interface Factory{
        fun create(@BindsInstance retryCount:Int) : UserRegistrationComponent
    // it bind an variable or property with object at runtime it create an object through this property
    }
}
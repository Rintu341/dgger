package com.example.daggerandhilt

import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import javax.inject.Singleton
@ActivityScope
@Subcomponent( modules = [NotificationServiceModule::class,UserRepositoryServiceModule::class])
interface UserRegistrationComponent {

    fun inject(mainActivity: MainActivity) // mainActivity is a consumer

//    fun getEmailService():EmailService


    /*
    @Subcomponent.Factory
    interface Factory{
        fun create(@BindsInstance retryCount:Int) : UserRegistrationComponent
    // it bind an variable or property with object at runtime it create an object through this property
    }
   */
}
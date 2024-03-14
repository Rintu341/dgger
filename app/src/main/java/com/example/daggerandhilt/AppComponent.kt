package com.example.daggerandhilt

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AnalyticsServiceModule::class])
interface AppComponent {
//    fun getAnalyticsService():AnalyticsService
    fun getUserRegistrationComponent(): UserRegistrationComponent
}
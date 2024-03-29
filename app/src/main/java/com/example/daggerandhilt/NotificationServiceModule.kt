package com.example.daggerandhilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.migration.DisableInstallInCheck
import javax.inject.Named
import javax.inject.Singleton

@Module
@DisableInstallInCheck
class NotificationServiceModule() {

//    @Singleton
    @MassageQualifier
    @Provides
    fun getMassageService() : NotificationService
    {
        // write logic which type or Service we want to pass
        return MassageService(3)
    }

    @Named("email")
    @Provides
    fun getEmailService(emailService: EmailService):NotificationService
    {
        return emailService
    }
}
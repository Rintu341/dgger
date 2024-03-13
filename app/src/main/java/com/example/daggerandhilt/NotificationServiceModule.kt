package com.example.daggerandhilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.migration.DisableInstallInCheck
import javax.inject.Named

@Module
@DisableInstallInCheck
class NotificationServiceModule() {
    @MassageQualifier
    @Provides
    fun getNotificationService(retryCount:Int) : NotificationService
    {
        // write logic which type or Service we want to pass
        return MassageService(retryCount)
    }

    @Named("email")
    @Provides
    fun getEmailService(emailService: EmailService):NotificationService
    {
        return emailService
    }
}
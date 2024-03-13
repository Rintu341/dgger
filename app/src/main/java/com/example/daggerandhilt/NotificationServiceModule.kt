package com.example.daggerandhilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.migration.DisableInstallInCheck

@Module
@DisableInstallInCheck
class NotificationServiceModule {

    @Provides
    fun getNotificationService() : NotificationService
    {
        // write logic which type or Service we want to pass
        return MassageService()
    }
}
package com.example.daggerandhilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.migration.DisableInstallInCheck

@Module
@DisableInstallInCheck
class UserRegistrationServiceModule {

    @Provides
    fun getUserRepositoryService():UserRepository
    {
        // Write logic which object we want to pass

        return FireBaseRepository()
    }
}
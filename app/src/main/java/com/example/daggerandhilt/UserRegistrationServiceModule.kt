package com.example.daggerandhilt

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.migration.DisableInstallInCheck

@Module
@DisableInstallInCheck
abstract class UserRegistrationServiceModule {

    @Binds
    abstract  fun getUserRepositoryService(sqlRepository: SQLRepository):UserRepository

}
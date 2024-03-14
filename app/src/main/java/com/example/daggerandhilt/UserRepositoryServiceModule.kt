package com.example.daggerandhilt

import dagger.Binds
import dagger.Module
import dagger.hilt.migration.DisableInstallInCheck
import javax.inject.Singleton

@Module
@DisableInstallInCheck
abstract class UserRepositoryServiceModule {

    @Binds
    @ApplicationScope
    abstract  fun getSQLRepositoryService(sqlRepository: SQLRepository):UserRepository

}
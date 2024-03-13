package com.example.daggerandhilt

import dagger.Binds
import dagger.Module
import dagger.hilt.migration.DisableInstallInCheck

@Module
@DisableInstallInCheck
abstract class UserRepositoryServiceModule {

    @Binds
    abstract  fun getSQLRepositoryService(sqlRepository: SQLRepository):UserRepository

}
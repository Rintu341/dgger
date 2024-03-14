package com.example.daggerandhilt

import dagger.Module
import dagger.Provides
import dagger.hilt.migration.DisableInstallInCheck
import javax.inject.Singleton

@Module
@DisableInstallInCheck
class AnalyticsServiceModule {
    @Singleton
    @Provides
    fun getAnalyticsService():AnalyticsService
    {
        return Mixpanel()
    }
}
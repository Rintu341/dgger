package com.example.daggerandhilt

import dagger.Module
import dagger.Provides
import dagger.hilt.migration.DisableInstallInCheck

@Module
@DisableInstallInCheck
class AnalyticsServiceModule {
    @Provides
    fun getAnalyticsService():AnalyticsService
    {
        return Mixpanel()
    }
}
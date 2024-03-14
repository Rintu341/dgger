package com.example.daggerandhilt

import android.util.Log

interface AnalyticsService {
    fun trackEvent(eventName:String,eventType:String)
}

class Mixpanel : AnalyticsService
{
    override fun trackEvent(eventName: String, eventType: String) {
        Log.d("Mixpanel","$eventName --$eventType")
    }
}

class FireBaseAnalytics : AnalyticsService
{
    override fun trackEvent(eventName: String, eventType: String) {
        Log.d("FireBaseAnalytics","$eventName --$eventType")
    }
}
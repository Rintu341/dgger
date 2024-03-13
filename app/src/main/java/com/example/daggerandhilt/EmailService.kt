package com.example.daggerandhilt

import android.content.ContentValues.TAG
import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

interface NotificationService{
    fun send(to:String,from:String,body:String)
}

@Singleton
class EmailService @Inject constructor() : NotificationService{  //  This is called constructor injection
    override fun send(to:String, from:String, body:String)
    {
        //TODO
    }

}
@Singleton
class MassageService(private val retryCount:Int) : NotificationService
{
    override fun send(to: String, from: String, body: String) {
        Log.d("TAG", "Massage Send --- $retryCount")
    }

}


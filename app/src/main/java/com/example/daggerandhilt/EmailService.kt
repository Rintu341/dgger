package com.example.daggerandhilt

import javax.inject.Inject

interface Notification{
    fun send(to:String,from:String,body:String)
}

class EmailService @Inject constructor() : Notification{  //  This is called constructor injection
    override fun send(to:String, from:String, body:String)
    {
        //TODO
    }

}

class MassageService() : Notification
{
    override fun send(to: String, from: String, body: String) {
        TODO("Not yet implemented")
    }

}


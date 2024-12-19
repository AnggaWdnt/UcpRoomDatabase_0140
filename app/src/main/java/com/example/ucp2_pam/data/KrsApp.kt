package com.example.ucp2_pam.data

import android.app.Application
import com.example.ucp2_pam.data.dependenciesinjection.ContainerApp
import com.example.ucp2_pam.data.dependenciesinjection.InterfaceContainerApp

class KrsApp : Application() {
    lateinit var containerApp: InterfaceContainerApp
    override fun onCreate() {
        super.onCreate()
        containerApp = ContainerApp(this)
    }
}
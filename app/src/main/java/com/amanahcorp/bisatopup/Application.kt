package com.amanahcorp.bisatopup

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class Application : Application() {
    override fun onCreate() {
        super.onCreate()

        // TODO : Setup Koin Here
        startKoin {
            androidContext(this@Application)
            // TODO : write modules here
            modules(
                // module list
            )
        }
    }
}
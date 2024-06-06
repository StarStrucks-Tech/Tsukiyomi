package com.starstruckstech.pgpodandroid.central_logger

import android.app.Application
import timber.log.Timber

class PGPodApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}
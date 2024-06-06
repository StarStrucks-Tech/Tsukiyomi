package com.starstruckstech.pgpodandroid

import android.app.Application
import timber.log.Timber

/**
 * This class is used to initialize the Timber library for logging
 * @constructor Creates an instance of PGPodApplication
 * @return Nothing
 */
class PGPodApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}
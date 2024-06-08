package com.starstruckstech.pgpodandroid.central_logger

import timber.log.Timber

object CentralLogger {

    /**
     * This method is used to log the debug message
     * @param tag: String
     * @param message: String
     */
    fun logWarning(tag: String, message: String) {
        Timber.tag(tag).w(message)
    }


    /**
     * This method is used to log the error message
     * @param tag: String
     * @param message: String
     */
    fun logError(tag: String, message: String) {
        Timber.tag(tag).e(message)
    }


    /**
     * This method is used to log the debug message
     * @param tag: String
     * @param message: String
     */
    fun logStatement(tag: String, message: String) {
        Timber.tag(tag).d(message)
    }


    /**
     * This method is used to log the info message
     * @param tag: String
     * @param message: String
     */
    fun logInfo(tag: String, message: String) {
        Timber.tag(tag).i(message)
    }
}
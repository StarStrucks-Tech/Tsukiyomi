package com.starstruckstech.pgpodandroid.central_logger

/**
 * This data class is used to define the log entry
 * @param level: LogLevel
 * @param tag: String
 * @param message: String
 * @param timestamp: Long
 */
data class LogEntry(
    val level: LogLevel,
    val tag: String,
    val message: String,
    val timestamp: Long = System.currentTimeMillis()
)

package com.starstruckstech.pgpodandroid

import com.google.firebase.firestore.FirebaseFirestore

object CentralLogger {
    private val db = FirebaseFirestore.getInstance()

    fun log(level: LogLevel, tag: String, message: String) {
        val logEntry = LogEntry(level, tag, message)
        db.collection("logs")
            .add(logEntry)
            .addOnSuccessListener { documentReference ->
                // Log successfully written
            }
            .addOnFailureListener { e ->
                // Handle failure
            }
    }
}
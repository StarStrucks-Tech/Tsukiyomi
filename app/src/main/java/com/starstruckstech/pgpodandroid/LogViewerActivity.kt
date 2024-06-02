package com.starstruckstech.pgpodandroid

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.firestore.FirebaseFirestore

class LogViewerActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var logAdapter: LogAdapter
    private val logs = mutableListOf<LogEntry>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_viewer)

        recyclerView = findViewById(R.id.recyclerViewLogs)
        recyclerView.layoutManager = LinearLayoutManager(this)
        logAdapter = LogAdapter(logs)
        recyclerView.adapter = logAdapter

        fetchLogs()
    }

    private fun fetchLogs() {
        val db = FirebaseFirestore.getInstance()
        db.collection("logs")
            .get()
            .addOnSuccessListener { result ->
                logs.clear()
                for (document in result) {
                    val logEntry = document.toObject(LogEntry::class.java)
                    logs.add(logEntry)
                }
                logAdapter.notifyDataSetChanged()
            }
            .addOnFailureListener { e ->
                // Handle failure
            }
    }
}

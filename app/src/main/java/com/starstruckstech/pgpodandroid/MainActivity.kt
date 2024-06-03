package com.starstruckstech.pgpodandroid

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.FirebaseApp
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.platform.ComposeView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.viewmodel.compose.viewModel
import okhttp3.internal.platform.android.BouncyCastleSocketAdapter.Companion.factory

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        FirebaseApp.initializeApp(this)

        CentralLogger.log(LogLevel.INFO, "MainActivity", "App started")
    }
}
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val composeView = findViewById<ComposeView>(R.id.composeVIew)
        composeView.setContent {
            val viewModel: PostViewModel = viewModel(
                factory = PostViewModelFactory(PostRepository(NetworkHelper(RetrofitClient.retrofitService))
                )
                factory = PostViewModelFactory(PostRepository(RetrofitClient.retrofitService))
            )
            val posts by viewModel.posts.observeAsState(emptyList())
            PostScreen(posts)

        }
    }

}
    }}}

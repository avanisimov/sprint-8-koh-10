package ru.practicum.sprint8koh10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {

    val initTime = System.currentTimeMillis()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        toolbar.setNavigationOnClickListener {
            onBackPressed()
        }
        Log.d("SPRINT_8", "onCreate $this ${System.currentTimeMillis() - initTime} ms")
    }

    override fun onStart() {
        super.onStart()
        Log.d("SPRINT_8", "onStart $this ${System.currentTimeMillis() - initTime} ms")
    }

    override fun onResume() {
        super.onResume()
        Log.d("SPRINT_8", "onResume $this ${System.currentTimeMillis() - initTime} ms")
    }


    override fun onPause() {
        super.onPause()
        Log.d("SPRINT_8", "onPause $this ${System.currentTimeMillis() - initTime} ms")
    }

    override fun onStop() {
        super.onStop()
        Log.d("SPRINT_8", "onStop $this ${System.currentTimeMillis() - initTime} ms")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("SPRINT_8", "onDestroy $this ${System.currentTimeMillis() - initTime} ms")
    }
}
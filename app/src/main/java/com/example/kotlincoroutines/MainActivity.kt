package com.example.kotlincoroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val scope = CoroutineScope(CoroutineName("MyScope"))

        scope.launch {
            val job1 = launch {
                while (true){
                    delay(1000L)
                    Log.d("Corou","job 1 running..........")
                }
            }
        }
    }

    override fun onResume() {
        Log.d("Corou","onResume")
        super.onResume()
    }

    override fun onStart() {
        Log.d("Corou","onStart")
        super.onStart()
    }

    override fun onDestroy() {
        Log.d("Corou","onDestroy")
        super.onDestroy()
    }
}
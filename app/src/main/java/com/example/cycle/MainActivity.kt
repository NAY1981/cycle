package com.example.cycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    var LOG_TAG = "MYLOG"

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d (LOG_TAG, "onCreate(There is nothing sadder in the world) called")
    }

    override fun onStart() {
        super.onStart()
        Log.d (LOG_TAG, "onStart(Innocent dejected beauty,) called")
    }
    override fun onRestart() {
        super.onRestart()
        Log.d (LOG_TAG, "onRestart(Plunged into treacherous nets) called")
    }

    override fun onResume() {
        super.onResume()
        Log.d (LOG_TAG, "onResume(The enmity of cruel, malicious slander:) called")
    }

    override fun onPause() {
        super.onPause()
        Log.d (LOG_TAG, "onPause(Under the power of a charming dream) called")
    }

    override fun onStop() {
        super.onStop()
        Log.d (LOG_TAG, "onStop(Or am I a female knight more reliable than steel,) called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d (LOG_TAG, "onDestroy(But seeing the grief of female purity,) called")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d (LOG_TAG, "onSaveInstanceState(My soul shrinks in sorrow.) called")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d (LOG_TAG, "onRestoreInstanceState(I have hardly experienced more agonizing anguish.) called")
    }
}
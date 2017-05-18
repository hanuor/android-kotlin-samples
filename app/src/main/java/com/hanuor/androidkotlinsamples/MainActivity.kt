package com.hanuor.androidkotlinsamples

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val helloWorld = findViewById(R.id.helloWorld) as TextView
        helloWorld.setText("Hey world!. This is Kotlin!")
    }
}

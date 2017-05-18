package com.hanuor.androidkotlinsamples

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val helloWorld = findViewById(R.id.helloWorld) as TextView
        helloWorld.setText("Hey world!. This is Kotlin!")
        val color = Color.parseColor("#bdbdbd")
        helloWorld.setTextColor(color)

        val button = findViewById(R.id.button) as Button
        button.setText("I'm a button")
        button.setTextColor(Color.parseColor("#ffffff"))
        button.setBackgroundColor(Color.parseColor("#212121"))

        button.setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View?) {
                Toast.makeText(this@MainActivity, "hey there!", Toast.LENGTH_SHORT).show()
                val vas: Intent
                vas.setClass(this@MainActivity, )
            }

        });
    }
    fun setViews(){
    }
}

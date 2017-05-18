package com.hanuor.androidkotlinsamples

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val backtext = findViewById(R.id.backText) as TextView
        backtext.setText("Enter some text")
        val edittext = findViewById(R.id.editText) as EditText
        val display = findViewById(R.id.displayText) as Button
        clickfunction(display, edittext, backtext)
    }
    fun clickfunction(displayButton: Button, editText: EditText, backtext: TextView){
        displayButton.setOnClickListener(object: View.OnClickListener {
            override fun onClick(v: View?) {
                var getText: String = editText.getText().toString()
                backtext.setText(getText)
            }

        })
    }
}

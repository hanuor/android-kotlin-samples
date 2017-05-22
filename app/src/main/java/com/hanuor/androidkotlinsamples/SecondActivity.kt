package com.hanuor.androidkotlinsamples

import android.os.AsyncTask
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast



class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val intent = intent
        val ss = intent.getStringExtra("yolo")
        Toast.makeText(this@SecondActivity, " Step up" + ss, Toast.LENGTH_SHORT).show()
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
                asyncTaskFlash()

            }
        })
    }


    fun asyncTaskFlash(){
        object: AsyncTask<Void, Void, String>(){
            override fun doInBackground(vararg params: Void?): String {
                var sampleJson: String = "https://gist.githubusercontent.com/hanuor/c3a94602155d23e46daac9c18903899d/raw/ae5313ad810308dcfbfda2dda75bcee73c8830d6/sampleJson"
                //Do some task here
                try {
                    //Do some task here
                }catch (e : Exception){
                    e.printStackTrace()
                }
             return sampleJson
            }

            override fun onPostExecute(result: String?) {
                super.onPostExecute(result)
                Toast.makeText(this@SecondActivity, " Hey " + result, Toast.LENGTH_SHORT).show()
            }
        }.execute()
    }
}

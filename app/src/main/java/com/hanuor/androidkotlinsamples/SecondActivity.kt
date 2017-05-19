package com.hanuor.androidkotlinsamples

import android.os.AsyncTask
import android.os.Bundle
import android.support.v4.app.FragmentActivity
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.json.JSONObject
import java.io.BufferedInputStream
import java.io.IOException
import java.net.HttpURLConnection
import java.net.MalformedURLException
import java.net.ProtocolException
import java.net.URL

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
                asyncTaskFlash()

            }
        })
    }


    fun asyncTaskFlash(){
        Log.d("Hey", "sdsdsds")
        object: AsyncTask<Void, Void, String>(){
            override fun doInBackground(vararg params: Void?): String {
                var sampleJson: String = "https://gist.githubusercontent.com/hanuor/c3a94602155d23e46daac9c18903899d/raw/ae5313ad810308dcfbfda2dda75bcee73c8830d6/sampleJson"
              Log.d("ghee","asdas" + sampleJson)
                try {
                    val url = URL(sampleJson)
                    val conn = url.openConnection() as HttpURLConnection
                    conn.setRequestMethod("GET")
                    // read the response
                    val buff = BufferedInputStream(conn.getInputStream())
                    response = convertStreamToString(buff)
                } catch (e: MalformedURLException) {
                    Log.e(FragmentActivity.TAG, "MalformedURLException: " + e.getMessage())
                } catch (e: ProtocolException) {
                    Log.e(FragmentActivity.TAG, "ProtocolException: " + e.getMessage())
                } catch (e: IOException) {
                    Log.e(FragmentActivity.TAG, "IOException: " + e.getMessage())
                } catch (e: Exception) {
                    Log.e(FragmentActivity.TAG, "Exception: " + e.message)
                }

                try {
                    val jsonObject: JSONObject = JSONObject(sampleJson)
                    Log.d("sample", " " + jsonObject)
                }catch (e : Exception){

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

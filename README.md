# Android + ~~Java~~ Kotlin   
[![kotlin_250x250.png](https://s16.postimg.org/6slikb3ud/kotlin_250x250.png)](https://postimg.org/image/b1q8mh73l/)     
Android Kotlin samples     
Because converting code is too mainstream.
____
Get started with the new official language for Android app development - Kotlin. 
#### Code samples, instructions and much more

## Getting started    
[![Android+Studio+3.0.png](https://s13.postimg.org/pk0yemg13/Android_Studio_3.0.png)](https://postimg.org/image/t3mw4fiqr/)    
As of now Kotlin based IDE hasn't officially launched yet. But we are developers eh! Follow this link to download Android studio 3.0 (Canary) :        
##### Download    
[Android studio 3.0 preview](https://developer.android.com/studio/preview/index.html)   
*If you are working on a stable version then don't freak out. This version won't affect your existing work/settings/environment etc.*   

### findViewById
Till now we were using  
```Java   
...
TextView textView = (TextView) findViewById(R.id.text_view);    
Button buttonView = (Button) findViewById(R.id.button_view);
... 
``` 
   
In Kotlin we do: 
```kotlin   
...
val textview = findViewById(R.id.text_view) as TextView   
val buttonView = findViewById(R.id.button_view) as Button
...
```
Method accessability remains to be same:    
```kotlin   
textview.setText("Hello World. This is Kotlin!")
```   
Oh and did I mention you don't have to worry about semicolons? No? Well now you know. 

### onClickListeners
In Java we did
```java
button.setOnClickListener(new OnClickListener() {
    public void onClick(View v) {
        Toast.makeText(this, "Hey there!",
                Toast.LENGTH_LONG).show();
    }
});
```
Here is the Kotlin code:
```kotlin
button.setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View?) {
                Toast.makeText(this@MainActivity, "Hey there!", Toast.LENGTH_SHORT).show()
         }
 });
```
Notice that inside *setOnClickListener* method we are passing an **object** of View->OnClickListener (Interface). So instead of using **new**, in Kotlin we do **object:**      
This is a short example but here Kotlin bags all the points when it comes to code readability.        

### Starting a new Activity
In Java we started a new Activity through Intents like:     
```java
Intent intent = new Intent(this, SecondActivity.class);
startActivity(intent);
```
In Kotlin we do:
```kotlin
 val trigger = Intent(this@MainActivity, SecondActivity::class.java)
 startActivity(trigger)
 ```
 Here *trigger* is the Intent object.
 The second parameter *SecondActivity::class.java* looks fishy right? Well this is how we pass a reference to a class (in this case our activity) in Kotlin. See this link for more information: [Class references in Kotlin](https://kotlinlang.org/docs/reference/reflection.html#class-references)    
 
 ### AsyncTasks
 To create an object of a class in Kotlin we used the *object* keyword. Similarly here also we'll use this to make object of our AyncTask class.
 *Notice that you can copy and paste your Java code and Studio will automatically convert it to Kotlin.*
 Kotlin code:
 ```kotlin
 object: AsyncTask<Void, Void, String>(){
            override fun doInBackground(vararg params: Void?): String {
                var sampleJson: String =  "https://gist.githubusercontent.com/hanuor/c3a94602155d23e46daac9c18903899d/raw/ae5313ad810308dcfbfda2dda75bcee73c8830d6/sampleJson"
                //Do some task here
                try {
                    //some task here
                    Log.d("SecondActivity", " " + jsonObject)
                }catch (e : Exception){
                    e.printStackTrace()
                }
             return sampleJson
            }

            override fun onPostExecute(result: String?) {
                super.onPostExecute(result)
                Toast.makeText(this@SecondActivity, "HelloWorld" + result, Toast.LENGTH_SHORT).show()
            }
        }.execute()
```
```kotlin
object: AsyncTask<Void, Void, String>()
```

 _____



# Android + ~~Java~~ Kotlin   
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
*If you are working on stable version then don't freak out. This version won't affect your existing work/settings/environment etc.*   

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
 _____



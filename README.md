# Android + ~~Java~~ Kotlin   

Get started with the new official language for Android development - Kotlin.
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

# Kotlin_android_Tutorial
Using a HeadFirst android example, I explain some of kotlin's Syntax
Am learning kotlin using the headfirst approach where you build an app and learn something in the process. This app has two buttons,clicking on
one hides the text, clicking on the other shows the text. The code was originally written in java and android studio was used to convert the code to kotlin.

So i am trying to provide an understanding of kotlin code using java's structure in relation to how this project functions.

1.Code Structure.
https://user-images.githubusercontent.com/6191038/50584541-43a57e00-0e81-11e9-905a-8846aadfd64d.PNG)

The code structure in java is the same that in kotlin in the a class exists in a file, the class is opened and terminated by braces, and so is the method, and so is the method which exists with in the class. The has statements which take on 

2.Syntax:
Classes
A java android class that inherits from Activity looks like public class MainActivity extends Activity{//...}
A kotlin class that inherits from Activity looks like class MainActivity:Activity(){//..}
Kotlin has access modifiers public, private and protected like java though. ":" means extends in kotlin and superclasses.

Methods.
protected void onCreate(Bundle SavedInstanceState){//..} in java looks like fun onCreate(SavedInstanceState:Bundle?){//..} in Kotlin. As i understand it "fun" in Kotlin designates a method and even though kotlin has access modifiers like java, they aren't neccessary here. "fun" seems to sum them up both.
The method paramters are the opposite form of those in java. In java its Type then variable/object like, (Bundle SavedInstanceState). In Kotlin, is variable/object:the Type like (savedInstanceState: Bundle?). The "?" in Kotlin syntax when attached to a Type in parenthesis is meant to prevent a nullpointerexception which may occur in Kotlin is the Bundle variable, which is savedintancestate is null, which maybe the case if the app is just starting up. A Detailed explanation is here https://kotlinlang.org/docs/reference/null-safety.html#nullable-types-and-non-null-types.

Statements.
 val textView = findViewById<View>(R.id.text) as TextView
 textView.visibility = View.VISIBLE
  
  Both the hide and show functions have two statements within them, similar with a slight difference.
 <View> is the use of generics to make sure findViewById results in a view the same way a hashset<String> will hold only strings.
  
  "as TextView" is the of an unsafe cast, a form of kotlin typecasting, equivalent to "(TextView)" in java, to make sure an exception is thrown if the cast is not possible. More on that here https://kotlinlang.org/docs/reference/typecasts.html
  
  Lastly textView.visibility = View.VISIBLE; if you are calling a method on an class object/variable the arguments are after the equal sign as opposed to being in brackets like java.
  
  NOTE:Kotlin statements are not terminated using semi-colons. You just leave them unterminated.

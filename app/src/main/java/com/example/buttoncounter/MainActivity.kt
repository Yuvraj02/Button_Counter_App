package com.example.buttoncounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var userInput : EditText? = null
    private var button : Button? = null
    private var textView : TextView? = null

    private var counter : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userInput = findViewById(R.id.editText)
        button = findViewById(R.id.button)
        textView = findViewById(R.id.textView)

        textView?.movementMethod = ScrollingMovementMethod()

        button?.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                counter++
                if (counter==1){
                    textView?.text="The Button is clicked $counter time"
                }else{
                    textView?.append("\nThe Button is clicked $counter times")
                }
            }
        })

    }
}
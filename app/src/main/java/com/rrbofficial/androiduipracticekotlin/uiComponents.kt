package com.rrbofficial.androiduipracticekotlin

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class uiComponents : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ui_components)

  // Implicit intent
        var implicitBtn : Button = findViewById(R.id.implicitBtn)

        var explicitBtn : Button = findViewById(R.id.explicitBtn)

        val edittext : EditText = findViewById(R.id.implicitIntentText)

        implicitBtn.setOnClickListener()
        {
        // Implicit Intent
            val str = edittext.text.toString()
            // Create the Intent object of this class Context() to Second_activity class
            val intent = Intent(applicationContext, implicitIntent::class.java)
            // now by putExtra method put the value in key, value pair key is
            // message_key by this key we will receive the value, and put the string
            intent.putExtra("value", str)
            // start the Intent
            startActivity(intent)
        }

        explicitBtn.setOnClickListener()
        {
        // Explicit Intent
            val str = edittext.text.toString()
            var i :Intent = Intent(this,explicitIntent::class.java)
            // Passing data:
            i.putExtra("value",str)
            startActivity(i)

        }

    }

    fun GoToTextAndEditText(view: View) {

        val buttonClick = findViewById<Button>(R.id.textviewandedit)
        buttonClick.setOnClickListener {
            val intent = Intent(this, UItextAndEditText::class.java)
            startActivity(intent)

        }
    }
}
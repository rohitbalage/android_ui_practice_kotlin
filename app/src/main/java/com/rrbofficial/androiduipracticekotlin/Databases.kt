package com.rrbofficial.androiduipracticekotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Databases : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_databases)
    }

    fun goToFirebase(view: View) {
        val intent = Intent(this, Firebase::class.java)
        startActivity(intent)
    }
    fun goToMYSQL(view: View) {}
    fun goToMangoDB(view: View) {}
}
package com.example.belajarioandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    var inputEditText: EditText? = null
    var showButton: Button? = null
    var outputTextView: TextView? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inputEditText = findViewById(R.id.inputEditText)
        showButton = findViewById(R.id.showButton)
        outputTextView = findViewById(R.id.outputTextView)




        showButton?.setOnClickListener  {
            var new =inputEditText?.text.toString()
            Log.d("isi","$new string")
            outputTextView?.text ="$new"
            if (new?.equals("")) {
                Toast.makeText(this@MainActivity, "input harus di isi", Toast.LENGTH_SHORT).show()

            }


        }

    }


    }


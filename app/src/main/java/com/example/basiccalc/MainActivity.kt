package com.example.basiccalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var input1: EditText
    lateinit var input2: EditText
    lateinit var plus: Button
    lateinit var minus: Button
    lateinit var multi: Button
    lateinit var output: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        input1 = findViewById(R.id.input1)
        input2 = findViewById(R.id.input2)
        plus = findViewById(R.id.plus)
        minus = findViewById(R.id.minus)
        multi = findViewById(R.id.multiply)
        output = findViewById(R.id.output)
    }

    override fun onStart() {
        super.onStart()

        plus.setOnClickListener {
            var inputText1 = input1.text.toString()
            var inputText2 = input2.text.toString()
            var result = inputText1.toDouble()+ inputText2.toDouble()
            output.text = result.toString()
        }
        minus.setOnClickListener {
            var inputText1 = input1.text.toString()
            var inputText2 = input2.text.toString()
            var result = inputText1.toDouble()- inputText2.toDouble()
            output.text = result.toString()
        }
        multi.setOnClickListener {
            var inputText1 = input1.text.toString()
            var inputText2 = input2.text.toString()
            var result = inputText1.toDouble()* inputText2.toDouble()
            output.text = result.toString()
        }
    }
}
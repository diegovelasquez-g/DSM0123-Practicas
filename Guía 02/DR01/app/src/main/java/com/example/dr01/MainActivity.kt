package com.example.dr01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

//Variables
lateinit var calculate: Button
lateinit var numero1 : EditText
lateinit var numero2: EditText
lateinit var result: TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        numero1 = findViewById(R.id.editTextNumber1)
        numero2 = findViewById(R.id.editTextNumber2)
        calculate = findViewById(R.id.btnCalculate)
        result = findViewById(R.id.txtAns)

        calculate.setOnClickListener{
            var num1: Float = numero1.text.toString().toFloat()
            var num2: Float = numero2.text.toString().toFloat()
            var ans: Float = num1 + num2
            result.setText("El Resultado es: "+ ans.toString())


        }
    }
}
package com.example.calculadoraimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //dando funcionalidade a um botão
        val botaoCalc: Button = findViewById(R.id.button)
        botaoCalc.setOnClickListener {
            var altura: Double = 0.0
            var peso: Double = 0.0

            //Código para receber os dados dos editext e realizar os alculos e mostrat na textView
            var recebeAltura: EditText = findViewById(R.id.editTextNumberDecimal3)
            altura = (recebeAltura.getText().toString()).toDouble()

            var recebePeso: EditText = findViewById(R.id.editTextNumberDecimal2)
            peso = (recebePeso.getText().toString()).toDouble()

            val calculoImc: Double = peso / (altura * altura)
            val resultadoCalc: TextView = findViewById(R.id.textView)
            resultadoCalc.text = DecimalFormat("##,##0.00").format(calculoImc)
        }
    }
}
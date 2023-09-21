package com.example.myfirstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnResta = findViewById<Button>(R.id.btnResta)
        val btnSuma = findViewById<Button>(R.id.btnSuma)
        val btnMultiplicacion = findViewById<Button>(R.id.btnMultiplicacion)
        val btnDivision = findViewById<Button>(R.id.btnDivision)
        val editNum1 = findViewById<EditText>(R.id.editNum1)
        val editNum2 = findViewById<EditText>(R.id.editNum2)
        val txtNumResultado = findViewById<TextView>(R.id.txtNumResultado)

        btnResta.setOnClickListener{
            var N1 = editNum1.getText().toString().toDouble()
            var N2 = editNum2.getText().toString().toDouble()
            txtNumResultado.setText(resta(N1,N2).toString())
        }

        btnSuma.setOnClickListener{
            var N1 = editNum1.getText().toString().toDouble()
            var N2 = editNum2.getText().toString().toDouble()
            txtNumResultado.setText(suma(N1,N2).toString())
        }
        btnMultiplicacion.setOnClickListener{
            var N1 = editNum1.getText().toString().toDouble()
            var N2 = editNum2.getText().toString().toDouble()
            txtNumResultado.setText(multiplicacion(N1,N2).toString())
        }
        btnDivision.setOnClickListener{
            var N1 = editNum1.getText().toString().toDouble()
            var N2 = editNum2.getText().toString().toDouble()
            txtNumResultado.setText(division(N1,N2).toString())
        }

    }
    private fun resta(N1:Double,N2:Double):Double{
        return N1 - N2
    }
    private fun suma(N1:Double,N2:Double):Double{
        return N1 + N2
    }
    private fun division(N1:Double,N2:Double):Double{
        return N1 / N2
    }
    private fun multiplicacion(N1:Double,N2:Double):Double{
        return N1 * N2
    }
}
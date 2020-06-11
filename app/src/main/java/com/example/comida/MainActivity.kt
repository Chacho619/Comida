package com.example.comida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton =  findViewById<Button>(R.id.boton)
        val boton2 =  findViewById<Button>(R.id.boton2)

        boton.setOnClickListener {
            var intent = Intent(this, Usuario::class.java)
            startActivity(intent)

        }
        boton2.setOnClickListener {
            var intent = Intent(this, Confirmar::class.java)
            startActivity(intent)

        }
    }
}
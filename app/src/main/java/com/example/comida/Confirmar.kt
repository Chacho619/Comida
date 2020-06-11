package com.example.comida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_usuario.*

class Confirmar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirmar)
        val boton4 = findViewById<Button>(R.id.boton4)

        boton4.setOnClickListener {
            var intent = Intent(this, Ubicacion::class.java)
            startActivity(intent)
        }
    }
}
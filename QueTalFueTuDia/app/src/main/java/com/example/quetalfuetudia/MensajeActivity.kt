package com.example.quetalfuetudia

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity


class MensajeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mensaje)

        var opcion: Int

        val bundle = intent.extras
        if (bundle != null) {
            opcion = bundle.getInt("opcion")
            actualizarMensaje(opcion);
        };
    }

    fun actualizarMensaje(opcion: Int){
        val txt_mensaje: TextView = findViewById(R.id.txt_mensaje);
        when (opcion) {
            0 -> txt_mensaje.setText(R.string.mensaje1)
            1 -> txt_mensaje.setText(R.string.mensaje2)
            2 -> txt_mensaje.setText(R.string.mensaje3)
            3 -> txt_mensaje.setText(R.string.mensaje4)
        }
    }
}
package com.example.quetalfuetudia

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.activity.ComponentActivity


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn_enviar: Button = findViewById(R.id.btn_enviar)
        var rg_respuestas: RadioGroup = findViewById(R.id.rg_respuestas)

        btn_enviar.setOnClickListener{
            onClickEnviar();
            //val intent = Intent(this@MainActivity,MensajeActivity::class.java)
            //startActivity(intent)
        }
    }

    fun onClickEnviar(){
        val rg = findViewById<View>(R.id.rg_respuestas) as RadioGroup
        val radioValue = findViewById<View>(rg.checkedRadioButtonId)
        val idx: Int = rg.indexOfChild(radioValue)
        val radioText = (findViewById<View>(rg.checkedRadioButtonId) as RadioButton).text.toString()

        val intent = Intent(this@MainActivity,MensajeActivity::class.java)
        val b = Bundle()
        b.putInt("opcion", idx);
        intent.putExtras(b);

        startActivity(intent)
    }
}
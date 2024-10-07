package com.example.dosbotones

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.dosbotones.ui.theme.DosBotonesTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn_gracias:Button = findViewById(R.id.btn_gracias)
        var btn_estornudar:Button = findViewById(R.id.btn_estornudar)

        btn_gracias.setOnClickListener{
            Toast.makeText(this@MainActivity, "De nada!", Toast.LENGTH_SHORT).show()
        }

        btn_estornudar.setOnClickListener{
            Toast.makeText(this@MainActivity, "Salud!", Toast.LENGTH_SHORT).show()
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DosBotonesTheme {
        Greeting("Android")
    }
}
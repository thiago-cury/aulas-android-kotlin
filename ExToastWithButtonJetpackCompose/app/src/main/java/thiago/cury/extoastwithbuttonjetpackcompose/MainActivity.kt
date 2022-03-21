package thiago.cury.extoastwithbuttonjetpackcompose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import thiago.cury.extoastwithbuttonjetpackcompose.ui.theme.ExToastWithButtonJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(color = MaterialTheme.colors.background) {
                    MyToast()
                }
            }
        }
    }

    @Composable
    fun MyToast() {
        val context = LocalContext.current
        Column(
            content = {
                Button(onClick = {
                    Toast.makeText(
                        context,
                        "Oi",
                        Toast.LENGTH_LONG
                    ).show()
                }, content = {
                    Text(text = "Ok")
                })
            }, modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        )
    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        ExToastWithButtonJetpackComposeTheme {
            MyToast()
        }
    }
}
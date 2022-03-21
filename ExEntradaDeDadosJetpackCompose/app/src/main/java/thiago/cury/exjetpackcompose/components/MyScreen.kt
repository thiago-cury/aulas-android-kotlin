package thiago.cury.exjetpackcompose.components

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext

@Composable
fun MyScreen() {
    val context = LocalContext.current
    Column(
        content = {
            val query  = remember { mutableStateOf("") }
            TextField(value = query.value, onValueChange = {
                query.value = it
            },
            label = { Text("Digite o seu nome") })
            Button(onClick = {
                Toast.makeText(
                    context,
                    "Oie ${query.value}",
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
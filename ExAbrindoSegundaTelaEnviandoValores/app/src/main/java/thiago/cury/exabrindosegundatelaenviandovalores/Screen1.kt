package thiago.cury.exabrindosegundatelaenviandovalores

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class Screen1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen1)

        //buscando valores que vieram da MainActivity
        val fullName = intent.getStringExtra("fullName")
        val age = intent.getIntExtra("age", 0)

        //mostrando os valores
        toast("nome completo: $fullName idade: $age")

    }

    fun toast(message: String) {
        Toast.makeText(baseContext, message, Toast.LENGTH_LONG).show()
    }
}
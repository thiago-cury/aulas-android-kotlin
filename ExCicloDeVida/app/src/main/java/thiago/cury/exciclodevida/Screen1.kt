package thiago.cury.exciclodevida

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class Screen1 : AppCompatActivity() {

    val TAGSCREEN1ACTIVITY: String = "tag screen1 activity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen1)

        Log.d(TAGSCREEN1ACTIVITY, "entrou no oncreate da screen 1")

        //buscando valores que vieram da MainActivity
        val fullName = intent.getStringExtra("fullName")
        val age = intent.getIntExtra("age", 0)

        //mostrando os valores
        toast("nome completo: $fullName idade: $age")

    }

    override fun onStart() {
        super.onStart()
        Log.d(TAGSCREEN1ACTIVITY, "entrou no onstart da screen 1")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAGSCREEN1ACTIVITY, "entrou no onresume da screen 1")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAGSCREEN1ACTIVITY, "entrou no onpause da screen 1")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAGSCREEN1ACTIVITY, "entrou no onstop da screen 1")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAGSCREEN1ACTIVITY, "entrou no ondestroy da screen 1")
    }

    fun toast(message: String) {
        Toast.makeText(baseContext, message, Toast.LENGTH_LONG).show()
    }
}
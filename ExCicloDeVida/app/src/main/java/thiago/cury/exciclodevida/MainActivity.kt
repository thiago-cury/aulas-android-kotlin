package thiago.cury.exciclodevida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    //ciclo de vida da activity - atividade (tela)
    val TAGMAINACTIVITY: String = "tag main activity"

    private lateinit var buttonScreen1: Button
    private lateinit var editTextName: EditText
    private lateinit var editTextAge: EditText

    override fun onCreate(savedInstanceState: Bundle?) { //primeiro estágio
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        * Log.d -> debug
        * Log.e -> error
        * Log.w -> warning
        * Log.i -> information
        * Log.v -> verbose
        * Log.wtf -> ?
        */
        Log.d(TAGMAINACTIVITY, "entrou no oncreate")
        Log.i(TAGMAINACTIVITY, "entrou no oncreate")
        Log.w(TAGMAINACTIVITY, "entrou no oncreate")
        Log.e(TAGMAINACTIVITY, "entrou no oncreate")
        Log.v(TAGMAINACTIVITY, "entrou no oncreate")

        initialize()

        buttonScreen1.setOnClickListener {
            //Intent implicita
            //Intent explicita

            if(editTextName.text.toString().isEmpty() ||
               editTextAge.text.toString().isEmpty()) {

                toast("digite nome e idade")
            } else {
                //duas linhas
                val intent = Intent(this, Screen1::class.java)
                intent.putExtra("fullName", editTextName.text.toString())
                intent.putExtra("age", editTextAge.text.toString().toInt())
                //...... n putExtras...
                startActivity(intent)
//            finish()

                //uma linha
//            startActivity(Intent(this, Screen1::class.java))
            }

        }
    }

    override fun onStart() { //segundo estágio de abertura do app
        super.onStart()
        //gps, bluetooth, pegar uma localização
        Log.d(TAGMAINACTIVITY, "entrou no onstart")
    }

    override fun onResume() { //quando o usuário está vendo o aplicativo aberto
        super.onResume()
        Log.d(TAGMAINACTIVITY, "entrou no onresume")
    }

    override fun onPause() { //qdo sai de foco o aplicativo
        super.onPause()
        //desligar os sensores gps, bluetooth, pegar uma localização
        //poupar bateria
        //salvar informacoes....
        //salvar estado de tela.
        Log.d(TAGMAINACTIVITY, "entrou no onpause")
    }

    override fun onRestart() { //logo após on pause
        super.onRestart()
        Log.d(TAGMAINACTIVITY, "entrou no onrestart")
    }

    override fun onStop() { //após o onpause
        super.onStop()
        //listeners...
        Log.d(TAGMAINACTIVITY, "entrou no onstop")
    }

    override fun onDestroy() { //somente quando o aplicativo é fechado
        super.onDestroy()
        //listeners...
        Log.d(TAGMAINACTIVITY, "entrou no ondestroy")
    }

    private fun initialize() {
        buttonScreen1 = findViewById(R.id.buttonScreen1)
        editTextName = findViewById(R.id.editTextName)
        editTextAge = findViewById(R.id.editTextAge)
    }

    fun toast(message: String) {
        Toast.makeText(baseContext, message, Toast.LENGTH_LONG).show()
    }
}
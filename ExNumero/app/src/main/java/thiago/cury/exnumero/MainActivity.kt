package thiago.cury.exnumero
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import thiago.cury.exnumero.model.MyNumber

class MainActivity : AppCompatActivity() {

    private lateinit var editTextNumber: EditText
    private lateinit var buttonOK: Button
    val TAG_MAIN_ACTIVITY: String = "tagMainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initialize()
        buttonOK.setOnClickListener {
            Log.d(TAG_MAIN_ACTIVITY, "Clicou no botão")
            val myNumber = MyNumber()
            if(editTextNumber.text.toString().isNotEmpty()) {
                myNumber.number = editTextNumber.text.toString().toInt()
//                toast("o número digitado é: ${myNumber.number}")
                toast("${myNumber.toString()}")
//                toast("${myNumber.checkPositiveNumber()}")
            } else {
                toast("Erro! Digite um número")
            }
        }
    }

    fun initialize() {
        Log.d(TAG_MAIN_ACTIVITY, "entrou no initialize")
        editTextNumber = findViewById(R.id.editTextNumber)
        buttonOK = findViewById(R.id.buttonOK)
        Log.d(TAG_MAIN_ACTIVITY, "saiu do initialize")
    }

    fun toast(message: String) {
        Toast.makeText(baseContext, message, Toast.LENGTH_LONG).show()
    }

}
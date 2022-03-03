package thiago.cury.exentradadedadosedittext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import thiago.cury.exentradadedadosedittext.model.Client

class MainActivity : AppCompatActivity() {

    private lateinit var editTextName: EditText
    private lateinit var buttonOK: Button
    private lateinit var buttonClean: Button
    private lateinit var textViewResponse: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initializing()

        buttonOK.setOnClickListener {

            //chamada com um construtor primário cheio.
            var client = Client(editTextName.text.toString())

            if(client.name.isEmpty()) {
                toast("${resources.getText(R.string.toast_error_message)}")
            } else {
//                toast("${resources.getText(R.string.toast_ok_message)} ${client.name}")
                toast(client.toString())
                toast(client.convertNameToUpperCase())
//                toast("${client.convertNameToUpperCase()}")

                textViewResponse.text = client.convertNameToUpperCase()
            }

        }

        buttonClean.setOnClickListener {
            clean()
        }

    }

    private fun initializing() {
        editTextName = findViewById(R.id.editTextName)
        buttonOK = findViewById(R.id.buttonOK)
        buttonClean = findViewById(R.id.buttonClean)
        textViewResponse = findViewById(R.id.textViewResponse)
    }

    private fun clean() {
        textViewResponse.text = ""
        editTextName.text = null
        editTextName.clearFocus()
    }

    private fun toast(message: String) {
        Toast.makeText(
            baseContext,
            message,
            Toast.LENGTH_LONG).show()
    }
}
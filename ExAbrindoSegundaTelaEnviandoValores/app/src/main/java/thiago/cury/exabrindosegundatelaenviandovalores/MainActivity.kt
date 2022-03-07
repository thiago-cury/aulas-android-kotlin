package thiago.cury.exabrindosegundatelaenviandovalores

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var buttonScreen1: Button
    private lateinit var editTextName: EditText
    private lateinit var editTextAge: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initialize()

        buttonScreen1.setOnClickListener {
            //Intent explicita
            if (editTextName.text.toString().isEmpty() ||
                editTextAge.text.toString().isEmpty()
            ) {
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

    private fun initialize() {
        buttonScreen1 = findViewById(R.id.buttonScreen1)
        editTextName = findViewById(R.id.editTextName)
        editTextAge = findViewById(R.id.editTextAge)
    }

    private fun toast(message: String) {
        Toast.makeText(baseContext, message, Toast.LENGTH_LONG).show()
    }
}
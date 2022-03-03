package thiago.cury.exrandomnumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import thiago.cury.exrandomnumber.model.RandomNumber

class MainActivity : AppCompatActivity() {

    private lateinit var buttonOK: Button
    private lateinit var textViewResponse: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initializing()

        buttonOK.setOnClickListener {
            //gerar o número aleatório.
            val randomNumber = RandomNumber()

//            textViewResponse.text = "${randomNumber.generateRandomNumber()} %"
            textViewResponse.text = randomNumber.generateRandomNumber().toString()
        }
    }

    private fun initializing() {
        buttonOK = findViewById(R.id.buttonOK)
        textViewResponse = findViewById(R.id.textViewResponse)
    }
}
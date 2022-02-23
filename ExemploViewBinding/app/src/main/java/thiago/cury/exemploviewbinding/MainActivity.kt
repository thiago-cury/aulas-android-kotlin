package thiago.cury.exemploviewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import thiago.cury.exemploviewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button1.setOnClickListener {
            Toast.makeText(baseContext, "oi", Toast.LENGTH_LONG).show()
        }

        binding.buttonRegister.setOnClickListener {
            if(binding.editTextName.text.toString().isEmpty()) {
                Toast.makeText(baseContext, "digite um nome", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(baseContext, "seu nome é: ${binding.editTextName.text}", Toast.LENGTH_LONG).show()
            }
        }

    }
}
package thiago.cury.exintentexplicitaenviandoobjeto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import thiago.cury.exintentexplicitaenviandoobjeto.databinding.ActivityMainBinding
import thiago.cury.exintentexplicitaenviandoobjeto.model.Person

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonScreen1.setOnClickListener {

            val person = Person() //instanciando um objeto

            person.name = binding.editTextName.text.toString()

            if(binding.editTextAge.text.toString().isNotEmpty()) {
                person.age = binding.editTextAge.text.toString().toInt()
            }

            if(person.name.toString().isNotEmpty() && person.age != 0) {
                clean()
                val it = Intent(this@MainActivity, Screen1::class.java)
                it.putExtra("person", person)
                startActivity(it)
            } else {
                toast("Preencha os campos")
            }
        }
    }

    fun clean() {
        binding.editTextName.setText("")
        binding.editTextAge.setText("")
    }
}
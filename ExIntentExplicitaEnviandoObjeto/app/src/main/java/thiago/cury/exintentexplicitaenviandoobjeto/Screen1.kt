package thiago.cury.exintentexplicitaenviandoobjeto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import thiago.cury.exintentexplicitaenviandoobjeto.databinding.ActivityScreen1Binding
import thiago.cury.exintentexplicitaenviandoobjeto.model.Person

class Screen1 : AppCompatActivity() {

    private lateinit var binding: ActivityScreen1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityScreen1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val person = intent.getSerializableExtra("person") as Person
        toast("Ola ${person.name}, sua idade e ${person.age}")
        binding.textViewResponse.setText(person.toString())

    }
}
package thiago.cury.exspinnerstringarray

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import thiago.cury.exspinnerstringarray.databinding.ActivityMainBinding
import thiago.cury.exspinnerstringarray.model.Person

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonOK.setOnClickListener {
            if(binding.spinnerMaritalStatus.selectedItemPosition == 0) {
                toast("Escolha um estado civil")
            } else {
                val person = Person()
                person.maritalStatus = binding.spinnerMaritalStatus.selectedItem.toString()
                toast(person.toString())
            }
        }
    }
}
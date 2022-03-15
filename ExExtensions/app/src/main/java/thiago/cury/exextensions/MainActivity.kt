package thiago.cury.exextensions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import thiago.cury.exextensions.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    //EXTENSION

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonToast.setOnClickListener {
            toast("Oi")
//            getMyName()

            var name: String = "THIAGO CURY"
            toast(name.subSequence(1, 3).toString().lowercase())
            toast(name.myFun())
            toast("o seu nome é: ${"THIAGO".myFun()} ${"CURY".myFun()}")
        }
    }
}
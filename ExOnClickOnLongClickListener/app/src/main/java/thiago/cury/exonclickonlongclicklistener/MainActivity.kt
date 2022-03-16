package thiago.cury.exonclickonlongclicklistener

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import thiago.cury.exonclickonlongclicklistener.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener, View.OnLongClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonOK.setOnClickListener(this)
        binding.buttonOK.setOnLongClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            binding.buttonOK.id -> {
                toast("clicou no botao")
            }
            else -> {
                toast("erro")
            }
        }
    }

    override fun onLongClick(v: View?): Boolean {
        return when(v?.id) {
            binding.buttonOK.id -> {
                toast("clicou e segurou no botao")
                true
            }
            else -> {
                toast("erro")
                true
            }
        }
    }
}
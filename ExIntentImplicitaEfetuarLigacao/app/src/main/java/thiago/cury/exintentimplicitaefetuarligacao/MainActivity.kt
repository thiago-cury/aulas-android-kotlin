package thiago.cury.exintentimplicitaefetuarligacao

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import thiago.cury.exintentimplicitaefetuarligacao.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val CALL_PHONE_REQUEST_CODE : Int = 1000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonOK.setOnClickListener {
            makeCallPhone()
        }

    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)

        //switch
        when (requestCode) {
            CALL_PHONE_REQUEST_CODE -> {
                if (grantResults.isEmpty() || grantResults[0] != PackageManager.PERMISSION_GRANTED) {
                    toast("Usuário negou a permissao!")
                } else {
                    toast("Usuário aceitou a permissao!")

                    callPhone()

                }
            }
        }
    }

    private fun callPhone() {
        val phone = binding.editTextTexto.text.toString()
        val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:${phone}"))
        startActivity(intent)
    }

    private fun makeCallPhone(){
        //Se não possui permissão
        if (ContextCompat.checkSelfPermission(this@MainActivity, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

            //Verifica se já mostramos o alerta e o usuário negou alguma vez.
            if (ActivityCompat.shouldShowRequestPermissionRationale(this@MainActivity, Manifest.permission.CALL_PHONE)) {

                //Caso o usuário tenha negado a permissão anteriormente e não tenha marcado o check "nunca mais mostre este alerta"
                //Podemos mostrar um alerta explicando para o usuário porque a permissão é importante.
                toast("Você já negou antes essa permissão! \" + \"Para efetuar uma ligação necessitamos dessa permissão!")

                /* Além da mensagem indicando a necessidade sobre a permissão,
                   podemos solicitar novamente a permissão */

            }
            //Solicita a permissão
            requestPermission()
        } else {
            callPhone()
        }
    }

    private fun requestPermission() {
        ActivityCompat.requestPermissions(
            this@MainActivity,
            arrayOf(Manifest.permission.CALL_PHONE),
            CALL_PHONE_REQUEST_CODE
        )
    }
}
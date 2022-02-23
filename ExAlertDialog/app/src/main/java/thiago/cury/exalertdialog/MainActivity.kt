package thiago.cury.exalertdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Dessa forma não estamos internacionalizando o projeto.
        val alert1 = AlertDialog.Builder(this@MainActivity)
        alert1.setTitle("Título do alert")
        alert1.setMessage("Mensagem que será transimitida pelo Alert")
        alert1.setIcon(ContextCompat.getDrawable(applicationContext, R.mipmap.ic_launcher))
        alert1.setNeutralButton("OK", null)
        alert1.show()

        /* Dessa forma estamos internacionalizando o projeto.
         *  Note que estamos chamando resources.getString(), assim
         *  mantemos a internacionalização do nosso projeto com base nas variáveis criadas
         *  dentro do strings.xml */
        val alert2 = AlertDialog.Builder(this@MainActivity)
        alert2.setTitle(resources.getString(R.string.alert_title))
        alert2.setMessage(resources.getString(R.string.alert_message))
        alert2.setIcon(ContextCompat.getDrawable(applicationContext, R.mipmap.ic_launcher))
        alert2.setNeutralButton(resources.getString(R.string.alert_button), null)
        alert2.show()

    }
}
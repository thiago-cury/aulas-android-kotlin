package thiago.cury.exenviandotoastsnacbaralertcomfunction

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        snackTextMessage("Oi mas ahhh!")
//        snackIntMessage(R.string.snackbar_message)

//        toastTextMessage("Oi mas ahhh!")
//        toastIntMessage(R.string.toast_message)

//        alert("titulo", "mensagem", "Ok")
//        alert(R.string.alert_title, R.string.alert_message, R.string.alert_neutral_button)

        val parentLayout: View = findViewById(android.R.id.content)
        val snack = Snackbar.make(parentLayout, "Oi Snackbar!", Snackbar.LENGTH_LONG)
        snack.show()

        Snackbar.make(parentLayout, "Oi Snackbar!", Snackbar.LENGTH_LONG).show()
        Snackbar.make(
            parentLayout,
            resources.getText(R.string.snackbar_message),
            Snackbar.LENGTH_LONG
        ).show()

        Snackbar.make(
            findViewById(android.R.id.content),
            resources.getText(R.string.snackbar_message),
            Snackbar.LENGTH_LONG
        ).show()

//        val text = "Hello toast!"
//        val text1 = "another toast!"
//        val duration = Toast.LENGTH_SHORT
//
//        val toast = Toast.makeText(applicationContext, text, duration)
//        toast.show()
//
//        val toast1 = Toast.makeText(applicationContext, text1, duration)
//        toast1.show()

        //Toast não internacionalizada
//        Toast.makeText(
//            baseContext,
//            "Oi!",
//            Toast.LENGTH_LONG
//        ).show()

        //Toast internacionalizada
//        Toast.makeText(
//            baseContext,
//            resources.getText(R.string.toast_message), //resources.getString(R.string.toast_message),
//            Toast.LENGTH_LONG
//        ).show()

        //AlertDialog
//        val alert1 = AlertDialog.Builder(this@MainActivity)
//        alert1.setTitle("Título do Alert")
//        alert1.setMessage("Oi, alert!")
//        alert1.setNeutralButton("OK", null)
//        alert1.setIcon(
//            ContextCompat.getDrawable(
//                applicationContext,
//                R.mipmap.ic_launcher_round)
//        )
//        alert1.show()
//
//        val alert2 = AlertDialog.Builder(this@MainActivity)
//        alert2.setTitle(resources.getText(R.string.alert_title))
//        alert2.setMessage(resources.getText(R.string.alert_message))
//        alert2.setNeutralButton(resources.getText(R.string.alert_neutral_button), null)
//        alert2.setIcon(ContextCompat.getDrawable(applicationContext, R.mipmap.ic_launcher_round))
//        alert2.show()

        //Aqui serão inseridos os códigos iniciais da aplicação
        //Toast -> balão na parte inferior. -> menos utilizada!
        //SnackBar -> retangulo na parte inferior -> é o padrão atual.

        //AlertDialog -> caixa (janelinha) de dialogo com uma mensagem
        //e/ou com acao... action. Ok cancelar Sim não cancelar
        //-> muito utilizado, porém para mensagens críticas.
    }

    /* Outras funções(métodos) de utilização opcional.
       Podemos criar as nossas próprias funções e/ou utilizar
       as funções pré definidas da linguagem */

    fun toastTextMessage(message: String) {
        Toast.makeText(
            baseContext,
            message,
            Toast.LENGTH_LONG
        ).show()
    }

    fun toastIntMessage(message: Int) {
        Toast.makeText(
            baseContext,
            message,
            Toast.LENGTH_LONG
        ).show()
    }

    fun snackTextMessage(message: String) {
        Snackbar.make(
            findViewById(android.R.id.content),
            message,
            Snackbar.LENGTH_LONG
        ).show()
    }

    fun snackIntMessage(message: Int) {
        Snackbar.make(
            findViewById(android.R.id.content),
            message,
            Snackbar.LENGTH_LONG
        ).show()
    }

    fun alert(title: String, message: String, neutralButton: String) {
        val alert1 = AlertDialog.Builder(this@MainActivity)
        alert1.setTitle(title)
        alert1.setMessage(message)
        alert1.setNeutralButton(neutralButton, null)
        alert1.setIcon(
            ContextCompat.getDrawable(
                applicationContext,
                R.mipmap.ic_launcher_round)
        )
        alert1.show()
    }

    fun alert(title: Int, message: Int, neutralButton: Int) {
        val alert1 = AlertDialog.Builder(this@MainActivity)
        alert1.setTitle(title)
        alert1.setMessage(message)
        alert1.setNeutralButton(neutralButton, null)
        alert1.setIcon(
            ContextCompat.getDrawable(
                applicationContext,
                R.mipmap.ic_launcher_round)
        )
        alert1.show()
    }
}
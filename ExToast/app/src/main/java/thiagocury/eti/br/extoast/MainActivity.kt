package thiagocury.eti.br.extoast

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Desta forma, o projeto não está internacionalizado, estamos definindo seu texto estático:
        Toast.makeText(baseContext,
                "Olá, mensagem enviada via Toast!",
                Toast.LENGTH_LONG).show()

        /*Conseguimos acessar a mensagem dentro do strings.xml com o método
        resources.getString(), assim mantendo o projeto internacionalizado:*/
        Toast.makeText(baseContext,
                resources.getString(R.string.mensagem_toast),
                Toast.LENGTH_LONG).show()

        //Centralizando a Toast com gravity:
        val t = Toast.makeText(
                baseContext,
                "Olá, mensagem enviada via Toast!",
                Toast.LENGTH_LONG)
        t.setGravity(Gravity.CENTER_HORIZONTAL or Gravity.CENTER_VERTICAL, 0, 0)
        t.show()

    }
}
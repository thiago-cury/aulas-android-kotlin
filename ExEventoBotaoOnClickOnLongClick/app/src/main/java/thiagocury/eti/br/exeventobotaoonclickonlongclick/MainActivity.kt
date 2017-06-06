package thiagocury.eti.br.exeventobotaoonclickonlongclick

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    val btnToast1 by lazy { findViewById(R.id.btnToast1) as Button }
    val btnToast2 by lazy { findViewById(R.id.btnToast2) as Button }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Referencia
        //val btnToast1 = findViewById(R.id.btnToast1) as Button
        //val btnToast2 = findViewById(R.id.btnToast2) as Button

        //Setando o Evento onClick
        btnToast1.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                //Lembrando que desta forma estamos internacionalizando o projeto
                Toast.makeText(baseContext, resources.getString(R.string.mensagem_toast_clique_1), Toast.LENGTH_LONG).show()
            }
        })

        //Setando o Evento onLongClick
        btnToast1.setOnLongClickListener(object : View.OnLongClickListener {
            override fun onLongClick(v: View?): Boolean {
                //Lembrando que desta forma estamos internacionalizando o projeto
                Toast.makeText(baseContext, resources.getString(R.string.mensagem_toast_pressionar_1), Toast.LENGTH_LONG).show()
                return true
            }
        })

        // Outra forma de fazer onClick e onLongClick

        //Setando o Evento onClick com Lambda
        btnToast2.setOnClickListener {
            //Lembrando que desta forma estamos internacionalizando o projeto
            Toast.makeText(baseContext, resources.getString(R.string.mensagem_toast_clique_2), Toast.LENGTH_LONG).show()
        }//Fecha onClick

        //Setando o Evento onLong com Lambda
        btnToast2.setOnLongClickListener {
            //Lembrando que desta forma estamos internacionalizando o projeto
            Toast.makeText(baseContext, resources.getString(R.string.mensagem_toast_pressionar_2), Toast.LENGTH_LONG).show()
            true
        }
    }
}
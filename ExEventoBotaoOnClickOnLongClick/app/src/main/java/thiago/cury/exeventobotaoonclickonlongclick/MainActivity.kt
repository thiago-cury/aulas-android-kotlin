package thiago.cury.exeventobotaoonclickonlongclick

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    val buttonToast1 by lazy { findViewById(R.id.buttonToast1) as Button }
    val buttonToast2: Button by lazy { findViewById<Button>(R.id.buttonToast2) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Referencia
//        val buttonToast1 = findViewById(R.id.buttonToast1) as Button
//        val buttonToast2 = findViewById<Button>(R.id.buttonToast2)

        //Setando o evento onClick
        buttonToast1.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                //Lembrando que desta forma estamos internacionalizando o projeto
                Toast.makeText(
                    baseContext,
                    resources.getString(R.string.toast_message_click_1),
                    Toast.LENGTH_LONG).show()
            }
        })

        //Setando o evento onLongClick
        buttonToast1.setOnLongClickListener(object : View.OnLongClickListener {
            override fun onLongClick(v: View?): Boolean {
                //Lembrando que desta forma estamos internacionalizando o projeto
                Toast.makeText(
                    baseContext,
                    resources.getString(R.string.toast_message_pressed_1),
                    Toast.LENGTH_LONG).show()
                return true
            }
        })

        // Outra forma de fazer onClick e onLongClick

        //Setando o evento onClick com Lambda
        buttonToast2.setOnClickListener {
            //Lembrando que desta forma estamos internacionalizando o projeto
            Toast.makeText(
                baseContext,
                resources.getString(R.string.toast_message_click_2),
                Toast.LENGTH_LONG).show()
        }//fecha onClick

        //Setando o evento onLong com Lambda
        buttonToast2.setOnLongClickListener {
            //Lembrando que desta forma estamos internacionalizando o projeto
            Toast.makeText(
                baseContext,
                resources.getString(R.string.toast_message_pressed_2),
                Toast.LENGTH_LONG).show()
            true
        }

    }
}
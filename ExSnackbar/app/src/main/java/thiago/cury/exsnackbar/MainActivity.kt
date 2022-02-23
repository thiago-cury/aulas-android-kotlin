package thiago.cury.exsnackbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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

    }
}
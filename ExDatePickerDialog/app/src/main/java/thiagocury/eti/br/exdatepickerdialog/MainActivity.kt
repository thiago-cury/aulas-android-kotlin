package thiagocury.eti.br.exdatepickerdialog

import android.app.DatePickerDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.DatePicker
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var tvDate: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvDate = findViewById(R.id.ma_tv_date)

        val c = Calendar.getInstance()
        val cYear = c.get(Calendar.YEAR)
        val cMonth = c.get(Calendar.MONTH)
        val cDay = c.get(Calendar.DAY_OF_MONTH)

        tvDate.setOnClickListener(){
            val dpd = DatePickerDialog(this, DatePickerDialog.OnDateSetListener{ datePicker: DatePicker, mYear: Int, mMonth: Int, mDay: Int ->

                tvDate.setText("${mDay}/${mMonth+1}/${mYear}")

            }, cYear, cMonth, cDay)
            dpd.show()
        }
    }
}
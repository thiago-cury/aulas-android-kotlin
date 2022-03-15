package thiago.cury.exextensions

import android.app.Activity
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment

//SEF - single expression function
//fun Activity.toast(message: String) = Toast.makeText(this, message,Toast.LENGTH_LONG).show()

fun Activity.toast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}

fun Activity.alert(title: String, message: String, button: String) {
    //alert
}

fun Activity.snackBar(message: String, view: View) {
    //snack
}

//fun Fragment.toast(message: String) {
//    Toast.makeText(getActivity(), message, Toast.LENGTH_LONG).show()
//}

fun Activity.getMyName() {
    toast("Thiago")
}

fun String.myFun(): String {
    return this.subSequence(1, 3).toString().lowercase()
}

//fun Int
//fun Double
//fun Array

//    fun toast(message: String) {
//        Toast.makeText(baseContext, message, Toast.LENGTH_LONG).show()
//    }
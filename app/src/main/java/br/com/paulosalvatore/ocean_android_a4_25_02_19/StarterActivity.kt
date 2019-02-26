package br.com.paulosalvatore.ocean_android_a4_25_02_19

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_starter.*
import org.jetbrains.anko.alert
import org.jetbrains.anko.startActivityForResult
import org.jetbrains.anko.toast
import org.jetbrains.anko.yesButton

class StarterActivity : AppCompatActivity() {

    val REQUEST_CODE = 1

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (data != null &&
            requestCode == REQUEST_CODE &&
            resultCode == Activity.RESULT_OK) {
            val informacaoUsuario =
                data.getStringExtra("INFO_USUARIO")
//            toast(informacaoUsuario)

            alert(informacaoUsuario) {
                yesButton {  }
            }.show()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_starter)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
//            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                .setAction("Action", null).show()

//            val intent = Intent(this, MainActivity::class.java)
//            intent.putExtra("INFO", "StarterActivity")
//            startActivity(intent)
//            startActivity<MainActivity>("INFO" to "StarterActivity")

            startActivityForResult<MainActivity>(REQUEST_CODE, "INFO" to "StarterActivity")
        }
    }

}

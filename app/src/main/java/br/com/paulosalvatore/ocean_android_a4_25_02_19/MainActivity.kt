package br.com.paulosalvatore.ocean_android_a4_25_02_19

import android.app.Activity
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.longToast
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val info = intent.getStringExtra("INFO")
        tvPrincipal.text = info

        btEnviar.setOnClickListener {
            // Usuário clicar no botão
            // Verificar se algo foi digitado
            // Nada digitado, exibe "Digite alguma coisa"
            // Algo digitado, exibe o que foi digitado

            if (etPrincipal.text.toString() == "") {
                // Atualiza TextView com texto obtido do string resource
//                tvPrincipal.text = getText(R.string.type_some_text)

                // Exibe um toast (alerta embaixo)
//                Toast.makeText(this, R.string.type_some_text, Toast.LENGTH_LONG).show()
                toast(R.string.type_some_text)
//                longToast(R.string.type_some_text)


                // Exibe uma mensagem de erro direto no campo
                etPrincipal.error = getText(R.string.type_some_text)
            } else {
                val informacao = etPrincipal.text.toString()
                tvPrincipal.text = informacao

                intent.putExtra("INFO_USUARIO", informacao)
                setResult(Activity.RESULT_OK, intent)
                finish()
            }
        }
    }
}

package com.eltontozatto.igtiandroidp1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText

const val EXTRA_MESSAGE = "com.eltontozatto.igtiandroidp1.MENSAGEM"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun enviarMensagem(view: View) {
        Log.i("IGTI_ANDROID", "Botão enviar mensagem pressionado.")

        val editText = findViewById<EditText>(R.id.etMensagem)
        val mensagem = editText.text.toString()

        val intent = Intent(this, EnviarMensagemActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, mensagem)
        }
        startActivity(intent)
    }
}
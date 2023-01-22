package com.eltontozatto.igtiandroidp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class EnviarMensagemActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enviar_mensagem)

        val mensagem = intent.getStringExtra(EXTRA_MESSAGE)
        findViewById<TextView>(R.id.tvMensagem).apply {
            text = mensagem
        }
    }
}
package com.chimy.valkaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.chimy.valkaapp.ComoJugar.ComoJugarActivity
import com.chimy.valkaapp.Galeria.GaleriaActivity
import com.chimy.valkaapp.contadores.ContadoresActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnContadores = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.btnContadores)
        val btnComoJugar = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.btnComoJugar)
        val btnGaleria = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.btnGaleria)
        btnContadores.setOnClickListener { navigateToContadores() }
        btnComoJugar.setOnClickListener { navigateToComoJugar() }
        btnGaleria.setOnClickListener { navigateToGaleria() }
    }

    fun navigateToContadores(){
        val intent = Intent(this, ContadoresActivity::class.java)
        startActivity(intent)
    }
    private fun navigateToGaleria() {
        val intent = Intent(this, GaleriaActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToComoJugar() {
        val intent = Intent(this, ComoJugarActivity::class.java)
        startActivity(intent)
    }


}
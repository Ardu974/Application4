package com.example.myapplication4exercice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val Reponse21 = findViewById<Button>(R.id.Reponse21)
        val Reponse22 = findViewById<Button>(R.id.Reponse22)
        val Reponse23 = findViewById<Button>(R.id.Reponse23)
        val Reponse24 = findViewById<Button>(R.id.Reponse24)


        Toast.makeText(this,
            "Après avoir répondu, revenez au début du questionnaire", Toast.LENGTH_SHORT).show()

        Reponse21.setOnClickListener {
            Toast.makeText(this,
                "Tu confonds là....Essaie la question suivante", Toast.LENGTH_SHORT).show()
        }
        Reponse22.setOnClickListener {
            Toast.makeText(this,
                "Sans déconner???? Essaie la question suivante", Toast.LENGTH_SHORT).show()
        }
        Reponse23.setOnClickListener {
            Toast.makeText(this,
                "Bonne réponse !!!  Essaie la question suivante", Toast.LENGTH_SHORT).show()
        }
        Reponse24.setOnClickListener {
            Toast.makeText(this,
                "Sérieux??? Essaie la question suivante", Toast.LENGTH_SHORT).show()
        }

        val Precedent = findViewById<Button>(R.id.Precedent)
        Precedent.setOnClickListener {
            val newIntent = Intent(this,MainActivity::class.java)
            startActivity(newIntent)
    }
}}
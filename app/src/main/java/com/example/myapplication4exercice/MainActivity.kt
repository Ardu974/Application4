package com.example.myapplication4exercice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Reponse11 = findViewById<Button>(R.id.Reponse11)
        val Reponse12 = findViewById<Button>(R.id.Reponse12)
        val Reponse13 = findViewById<Button>(R.id.Reponse13)
        val Reponse14 = findViewById<Button>(R.id.Reponse14)


        Toast.makeText(this,
            "Répondez à la question et cliquez sur la Question Suivante", Toast.LENGTH_SHORT).show()

        Reponse11.setOnClickListener {
            Toast.makeText(this,
                "Tu confonds là....Essaie la question suivante", Toast.LENGTH_SHORT).show()
        }
        Reponse12.setOnClickListener {
            Toast.makeText(this,
                "Bonne réponse !!! Essaie la question suivante", Toast.LENGTH_SHORT).show()
        }
        Reponse13.setOnClickListener {
            Toast.makeText(this,
                "Sans déconner???? Essaie la question suivante", Toast.LENGTH_SHORT).show()
        }
        Reponse14.setOnClickListener {
            Toast.makeText(this,
                "Sérieux??? Essaie la question suivante", Toast.LENGTH_SHORT).show()
        }
        val BTQuestionsuivante = findViewById<Button>(R.id.BTQuestionsuivante)
        BTQuestionsuivante.setOnClickListener {
            val newIntent = Intent(this,MainActivity2::class.java)
            startActivity(newIntent)

            }



}
    }
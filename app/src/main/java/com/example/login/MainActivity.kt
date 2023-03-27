package com.example.login

import android.app.Activity
import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner

class MainActivity : AppCompatActivity() {

    val A1Bcriar = findViewById<Button>(R.id.A1Bcriar)
    val A1Blogin = findViewById<Button>(R.id.A1Blogin)
    val A1ETnome = findViewById<EditText>(R.id.A1ETnome)
    val A1ETsenha = findViewById<EditText>(R.id.A1ETsenha)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        A1Bcriar?.setOnClickListener {
            val intent = Intent(this@MainActivity, second_activity::class.java)
            startActivity(intent)
        }

       A1Blogin?.setOnClickListener{
            if ( A1ETnome.text.equals("Rodrigo") && A1ETsenha.text.equals("123")){
                alertCorrect();
            }
            else{
                alertWrong();
            }
        }
    }

    private fun alertCorrect() {
        val builder = AlertDialog.Builder(this@MainActivity)
        builder.setMessage("Atenção")
        builder.setTitle("usuário ok")
        builder.create().show()
    }
    private fun alertWrong() {
        val builder = AlertDialog.Builder(this@MainActivity)
        builder.setMessage("Atenção")
        builder.setTitle("usuário não ok")
        builder.create().show()
    }
}




package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var textInput: EditText
    private lateinit var btnInput: Button
    private lateinit var textResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textInput = findViewById(R.id.input)
        btnInput = findViewById(R.id.btnInput)
        textResult = findViewById(R.id.result)

        btnInput.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (textInput.text.toString().trim() != ""){
            Toast.makeText(this, "Nama Berhasil Di input",
                Toast.LENGTH_SHORT).show()

            textResult.text = textInput.text.toString().trim()
        }

        else{
            Toast.makeText(this, "Nama Kosong",
                Toast.LENGTH_SHORT).show()
        }

    }
}
package com.example.customizeddialog

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var dialog : Dialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClick = findViewById<Button>(R.id.btnClick)

        dialog = Dialog(this)
        dialog.window?.setBackgroundDrawable(getDrawable(R.drawable.bg_dialog))
        dialog.setContentView(R.layout.custom_dialog)

        val btnApp = dialog.findViewById<Button>(R.id.btnApp)
        val btnWeb = dialog.findViewById<Button>(R.id.btnbWeb)

        btnApp.setOnClickListener {
            Toast.makeText(this,"You like App",Toast.LENGTH_SHORT).show()
            dialog.dismiss()
        }

        btnWeb.setOnClickListener {
            Toast.makeText(this,"You like App",Toast.LENGTH_SHORT).show()
            dialog.dismiss()

        }

        btnClick.setOnClickListener {
            dialog.show()
        }
    }
}
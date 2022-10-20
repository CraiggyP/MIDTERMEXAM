package com.example.midtermexam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var button :Button
    private lateinit var sendText:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val idResult = TextFragment();
        val fragmanager = supportFragmentManager;
        fragmanager.beginTransaction().replace(R.id.idresult,idResult).commit()
        button = findViewById(R.id.btSend)
        sendText = findViewById(R.id.etText)
        button.setOnClickListener{
            val sharedPref = getSharedPreferences(PREFERENCES_NAME, MODE_PRIVATE)
            var intent = Intent(this,MainActivity::class.java)
            val editor = sharedPref.edit()
            editor.putString(USERNAME,sendText.text.toString())
            editor.commit()
            startActivity(intent)
        }
    }
}
package com.dgarciasarai.myplayer

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById(R.id.edit_text) as EditText
        val button = findViewById(R.id.button) as Button

        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                toast("Message: ${editText.text}")
            }
        })
    }

    fun toast(msg: String) = Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
}

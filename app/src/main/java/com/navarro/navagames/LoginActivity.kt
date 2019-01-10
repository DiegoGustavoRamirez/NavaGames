package com.navarro.navagames

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

    }

    fun login(){

        val etNameUser : EditText = findViewById(R.id.et_user)
        val etPasswordUser : EditText = findViewById(R.id.et_password)

        if(etNameUser.text.equals(getString(R.string.str_name_dummy)) && etPasswordUser.text.equals(getString(R.string.str_password_dummy))){
            val intent : Intent = Intent(this, MainActivity::class.java)
        }else{
            Toast.makeText(this, getString(R.string.strWarningLoginMessage), Toast.LENGTH_SHORT).show()
        }
    }
}

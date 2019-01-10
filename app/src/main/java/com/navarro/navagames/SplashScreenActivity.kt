package com.navarro.navagames

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle


class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val sharedPreferences =  this.getSharedPreferences(getString(R.string.str_file_name), 0)

        val intent : Intent  = if (sharedPreferences.getString(getString(R.string.str_name_user), getString(R.string.str_empty)).isEmpty())
                                    Intent(this, LoginActivity::class.java)
                                else
                                    Intent(this, MainActivity::class.java)
        startActivity(intent)

    }



}

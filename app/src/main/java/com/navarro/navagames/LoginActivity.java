package com.navarro.navagames;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {


    //Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        /*btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(view -> login());*/

    }

    /*private void login(){
        EditText etUserName = findViewById(R.id.etUser);
        EditText etPassword = findViewById(R.id.etPassword);

        Log.d("Usuario", etUserName.getText().toString());
        Log.d("Contrasenia", etPassword.getText().toString());
    }*/

    public void login2(View view){
        EditText etUserName = findViewById(R.id.etUser);
        EditText etPassword = findViewById(R.id.etPassword);

        Log.d("Usuario", etUserName.getText().toString());
        Log.d("Contrasenia", etPassword.getText().toString());
    }

}

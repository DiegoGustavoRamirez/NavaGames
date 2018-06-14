package com.navarro.navagames;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    TextView tvRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tvRegister = findViewById(R.id.tvRegister);

        tvRegister.setOnClickListener(view -> {
            // move to other activity
            Intent goToRegister = new Intent(LoginActivity.this, RegisterActivity.class);
            startActivity(goToRegister);

            // kill actual activity
            LoginActivity.this.finish();
        });

    }

    public void login(View view){
        EditText etUserName = findViewById(R.id.etUser);
        EditText etPassword = findViewById(R.id.etPassword);

        Log.d("Usuario", etUserName.getText().toString());
        Log.d("Contrasenia", etPassword.getText().toString());

        //TODO: create a intent to go to MainActivity
    }

}

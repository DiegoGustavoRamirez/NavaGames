package com.navarro.navagames;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.navarro.navagames.Utils.NameString;

public class LoginActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView tvRegister;

        tvRegister = findViewById(R.id.tvRegister);

        tvRegister.setOnClickListener(view -> {
            // move to other activity
            Intent goToRegister = new Intent(LoginActivity.this, RegisterActivity.class); // parameters: current activity, activity to go
            startActivity(goToRegister);

            // kill actual activity
            // LoginActivity.this.finish();
        });

    }


    public void login(View view){


        EditText etUserName = findViewById(R.id.etUser);
        EditText etPassword = findViewById(R.id.etPassword);

        // check if the username and password is validate

        String sUserName = etUserName.getText().toString();
        String sUserPassword = etPassword.getText().toString();

        if(sUserName.equals(NameString.sNameDummy) && sUserPassword.equals(NameString.sPasswordDummy)){ // success

            SharedPreferences spDataUser = getSharedPreferences(NameString.sSharedPreferencesName, 0); // parameters: name file, int = mode
            SharedPreferences.Editor speEditor = spDataUser.edit(); // allow modify my file

            speEditor.putString(NameString.sNameUser, sUserName); // parameters: name variable, value
            speEditor.putString(NameString.sPasswordUser, sUserPassword);

            speEditor.commit(); // write in file

            //TODO: create a intent to go to MainActivity

            Intent goToMainActivity = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(goToMainActivity);
            LoginActivity.this.finish();

        }else{ // fail

            Toast.makeText(getApplicationContext(), NameString.sWarningLoginMessage, Toast.LENGTH_SHORT).show(); // parameters: context, text, duration

        }



    }

}

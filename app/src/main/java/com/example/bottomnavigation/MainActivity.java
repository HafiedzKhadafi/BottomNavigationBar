package com.example.bottomnavigation;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    public static final String PREFS_NAME = "LoginPrefs";
    Button buttonlogin;
    EditText etusn, etpsw;
    String username, password;
    Context context;
    SharedPreferences sharedpreferences;
    SharedPreferences.Editor editor;
    Boolean login;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonlogin = findViewById(R.id.login_btn);
        etusn = findViewById(R.id.login_usn);
        etpsw = findViewById(R.id.login_psw);
        /*sharedpreferences = getSharedPreferences(PREFS_NAME, 0);
        login = sharedpreferences.getBoolean("login", false);
        if (sharedpreferences.getString("logged", null).toString().equals("logged")){
            Intent a = new Intent(MainActivity.this, bottomnavigation.class);
            startActivity(a);
        }*/
        sharedpreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        editor = sharedpreferences.edit();
        editor.putBoolean("login", true);
        editor.apply();

        buttonlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username = etusn.getText().toString();
                password = etpsw.getText().toString();
                if (username.equals("admin")&& password.equals("admin")){
                    Toast.makeText(MainActivity.this,"Login Berhasil!",Toast.LENGTH_LONG).show();
                    //sharedpreferences = getSharedPreferences(PREFS_NAME, 0);
                    editor = sharedpreferences.edit();
                    editor.putString("logged", "logged");
                    editor.commit();
                    login = sharedpreferences.getBoolean("login", false);
                    if(login==true){
                        Intent a = new Intent(getApplicationContext(), bottomnavigation.class);
                        a.putExtra("username", username);
                        a.putExtra("password", password);
                        startActivity(a);
                    }
                }
                else {
                    Toast.makeText(getApplicationContext(), "Username atau Password Salah!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
package com.example.bottomnavigation;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Edit_Profil extends AppCompatActivity {
    EditText editnama, editemail, editnotelpon;
    Button editsimpan, editbatal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_profil);

        editnama = findViewById(R.id.edit_nama);
        editemail = findViewById(R.id.edit_email);
        editnotelpon = findViewById(R.id.edit_notelpon);
        editsimpan = findViewById(R.id.edit_simpan);
        editbatal = findViewById(R.id.edit_batal);

        SharedPreferences pref = getApplicationContext().getSharedPreferences("Save", MODE_PRIVATE);
        final SharedPreferences.Editor editor = pref.edit();
        editsimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!editnama.getText().toString().equals("")&&!editemail.getText().toString().equals("")&&!editnotelpon.getText().toString().equals("")) {
                    editor.putString("Nama", editnama.getText().toString());
                    editor.putString("Email", editemail.getText().toString());
                    editor.putString("NomorTelpon", editnotelpon.getText().toString());
                    editor.commit();
                    startActivity(new Intent(getApplicationContext(), Profil.class));
                    finish();
                }
            }
        });
    }
}

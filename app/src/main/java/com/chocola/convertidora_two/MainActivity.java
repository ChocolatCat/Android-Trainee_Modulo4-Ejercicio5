package com.chocola.convertidora_two;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText txtName = findViewById(R.id.editTextTextPersonName);
        EditText txtLastname = findViewById(R.id.editTextTextPersonName2);
        EditText txtMail = findViewById(R.id.editTextTextEmailAddress);
        EditText txtPassword = findViewById(R.id.editTextTextPassword);
        Button btnSave = findViewById(R.id.button);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = txtName.getText().toString().trim().length() > 0 ? txtName.getText().toString() : "Nombre no ingresado";
                String lastname = txtLastname.getText().toString().trim().length() > 0 ? txtLastname.getText().toString() : "Apellido no ingresado";
                String mail = txtMail.getText().toString().trim().length() > 0 ? txtMail.getText().toString() : "Correo no ingresado";
                String password = txtPassword.getText().toString().trim().length() > 0 ? txtPassword.getText().toString() : "Password no ingresada";
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra("name", name);
                i.putExtra("lastname", lastname);
                i.putExtra("mail", mail);
                i.putExtra("password", password);
                MainActivity.this.startActivity(i);
            }
        });
    }
}
package com.chocola.convertidora_two;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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
                String name = "";
                String lastname = "";
                String mail = "";
                String password = "";
                boolean validName = false;
                boolean validLastname = false;
                boolean validMail = false;
                boolean validPassword = false;
                if(txtName.getText().toString().trim().length() > 0)
                {
                   name = txtName.getText().toString();
                   validName = true;
                }
                if(txtLastname.getText().toString().trim().length() > 0)
                {
                    lastname = txtLastname.getText().toString();
                    validLastname = true;
                }
                if(txtMail.getText().toString().trim().length() > 0 && txtMail.getText().toString().contains("@"))
                {
                    mail = txtMail.getText().toString();
                    validMail = true;
                }
                if(txtPassword.getText().toString().trim().length() >= 8)
                {
                    password = txtPassword.getText().toString();
                    validPassword = true;
                }

                if(validName && validLastname && validMail && validPassword){
                    Intent i = new Intent(MainActivity.this, SecondActivity.class);
                    i.putExtra("name", name);
                    i.putExtra("lastname", lastname);
                    i.putExtra("mail", mail);
                    i.putExtra("password", password);
                    MainActivity.this.startActivity(i);
                }
                else{
                    Toast.makeText(getApplicationContext(), getString(R.string.invalid_data), Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
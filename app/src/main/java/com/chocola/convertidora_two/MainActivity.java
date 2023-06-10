package com.chocola.convertidora_two;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewbinding.ViewBinding;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.chocola.convertidora_two.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        EditText txtName = binding.editTextTextPersonName;
        EditText txtLastname = binding.editTextTextPersonName2;
        EditText txtMail = binding.editTextTextEmailAddress;
        EditText txtPassword = binding.editTextTextPassword;
        Button btnSave = binding.button;

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
package com.chocola.convertidora_two;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String lastname = intent.getStringExtra("lastname");
        String mail = intent.getStringExtra("mail");
        String password = intent.getStringExtra("password");
        TextView txtName = findViewById(R.id.textView);
        TextView txtLastname = findViewById(R.id.textView2);
        TextView txtMail = findViewById(R.id.textView3);
        TextView txtPassword = findViewById(R.id.textView4);
        txtName.setText(name);
        txtLastname.setText(lastname);
        txtMail.setText(mail);
        txtPassword.setText(password);
    }
}

package com.chocola.convertidora_two;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.chocola.convertidora_two.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {

    private ActivitySecondBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String lastname = intent.getStringExtra("lastname");
        String mail = intent.getStringExtra("mail");
        String password = intent.getStringExtra("password");
        TextView txtName = binding.textView;
        TextView txtLastname = binding.textView2;
        TextView txtMail = binding.textView3;
        TextView txtPassword = binding.textView4;
        txtName.setText(name);
        txtLastname.setText(lastname);
        txtMail.setText(mail);
        txtPassword.setText(password);
    }
}

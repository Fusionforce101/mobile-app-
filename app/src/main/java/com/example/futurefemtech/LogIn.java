package com.example.futurefemtech;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LogIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_log_in);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.loginaccount), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        EditText username = findViewById(R.id.username);
        EditText password = findViewById(R.id.password);
        TextView pageTitle = findViewById(R.id.titlelogin);
        String loginTitle = "LOGIN PAGE";
        pageTitle.setText(loginTitle);

        Button clickLogin = findViewById(R.id.clicklogin);
        String datalogin = "LOGIN ";
        clickLogin.setText(datalogin);
        clickLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent passToMainPage = new Intent(LogIn.this, HomePage.class);
                startActivity(passToMainPage);
            }
        });
    }
}
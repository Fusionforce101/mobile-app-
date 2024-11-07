package com.example.futurefemtech;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.loginaccount), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button login = findViewById(R.id.login);
        String data1 = "LOGIN";
        login.setText(data1);
        Button signup = findViewById(R.id.signup);
        String data2 = "SIGN UP";
        signup.setText(data2);
        TextView about = findViewById(R.id.about);
        String dataabout = "";
        about.setText(dataabout);

        // on click of the btns

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent passToSignIn = new Intent(MainActivity.this,SignUp.class);
                startActivity(passToSignIn);
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent passToLogIn = new Intent(MainActivity.this,LogIn.class);
                startActivity(passToLogIn);
            }
        });

    }
}
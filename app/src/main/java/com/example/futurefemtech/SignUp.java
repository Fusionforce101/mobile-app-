package com.example.futurefemtech;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.icu.util.Calendar;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_up);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.loginaccount), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button createAccount = findViewById(R.id.clickcreateaccount);
        String data = "CREATE ACCOUNT";
        createAccount.setText(data);

        // on click to homepage

        createAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toHomePage = new Intent(SignUp.this, HomePage.class);
                startActivity(toHomePage);
            }
        });
        TextView signInTitle = findViewById(R.id.createaccointtitle);
        String data2 = "CREATE YOUR ACCOUNT";
        signInTitle.setText(data2);

        EditText setCalendar = findViewById(R.id.dateofbirth);

        ImageButton calenderCc = findViewById(R.id.imageButton);
        calenderCc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar cc = Calendar.getInstance();
                int month = cc.get(Calendar.MONTH);
                int year = cc.get(Calendar.YEAR);
                int dayOfMonth = cc.get(Calendar.DAY_OF_MONTH);

                // for the date picker
                DatePickerDialog datePickerDialog = new DatePickerDialog(
                        SignUp.this,
                        (view1, selectedYear, selectedMonth, selectedDay) -> {
                            // selectedMonth is zero-indexed
                            String date = selectedDay + "/" + (selectedMonth + 1) + "/" + selectedYear;
                            setCalendar.setText(date);
                        },
                        year, month, dayOfMonth
                );
                datePickerDialog.show();

            }
        });

    }
}
package com.example.futurefemtech;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AboutUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_about_us);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TextView missionInfo = findViewById(R.id.ourMissionInfo);
        String mi = "We are Innovate, a forward-thinking organization dedicated to transforming STEM education for girls. \n" +
                "Our mission is to make STEM accessible, engaging, and personalized, \n" +
                "using the power of advanced artificial intelligence to inspire the next generation \n" +
                "of female scientists, engineers, and innovators.\n" +
                " Through our platform, we empower young girls to \n" +
                "develop a strong foundation in science, technology,\n" +
                " engineering, and math by providing \n" +
                "them with customized learning paths that align with their unique interests and pace.";
        missionInfo.setText(mi);

        TextView missionTitle = findViewById(R.id.ourMissionTitle);
        String mt = "Our Mission";
        missionTitle.setText(mt);


        TextView aboutInfo = findViewById(R.id.aboutInfo);
        String ai = "We are Innovate, a forward-thinking organization dedicated \n" +
                "to transforming STEM education for girls.\n" +
                " Our mission is to make STEM accessible, engaging, and personalized, \n" +
                "using the power of advanced artificial intelligence to inspire the next \n" +
                "generation of female scientists, engineers, and innovators. Through our \n" +
                "platform, we empower young girls to develop a strong foundation in science, \n" +
                "technology, engineering, and math by providing them with customized learning \n" +
                "paths that align with their unique interests and pace.";
        aboutInfo.setText(ai);


        TextView aboutTitle = findViewById(R.id.aboutTitle);
        String at = "About Us";
        aboutTitle.setText(at);

        ImageView backBtn = findViewById(R.id.aboutArrow);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent passToHomePage = new Intent(AboutUs.this, HomePage.class);
                startActivity(passToHomePage);

            }
        });


    }
}
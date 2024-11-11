package com.example.futurefemtech;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Partners extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_partners);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        TextView partnerMission = findViewById(R.id.missionInfo);
        String infoMission ="Our mission at Innovate is to empower girls in STEM through collaboration. \n" +
                "By partnering with like-minded organizations, we provide enriched resources, mentorship,\n" +
                " and tools that enhance the learning journey. Together, we’re creating a future where \n" +
                "every girl can explore, engage, and excel in STEM, driving global impact.";
        partnerMission.setText(infoMission);

        TextView title = findViewById(R.id.titlePartners);
        String titleInfo = "Our Partners";
        title.setText(titleInfo);


        TextView benefits = findViewById(R.id.benefits);
       String benefitsInfo = "Our partnerships drive impact by aligning brands with our \n" +
               " mission in STEM education,fostering innovation, and expanding reach.\n" +
               " Together, we empower young women with STEM career pathways,\n" +
               " offering partners access to diverse talent and collaborative\n" +
               " opportunities that create lasting community impact.";
        benefits.setText(benefitsInfo);

        TextView titleBenefits = findViewById(R.id.titleBenefits);
        String tb = "Benefits";
        titleBenefits.setText(tb);





    }
}
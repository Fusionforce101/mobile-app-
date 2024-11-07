package com.example.futurefemtech;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home_page);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TextView projectTitle = findViewById(R.id.projecttitle);
        String title = "FUTUREFEMTECH";
        projectTitle.setText(title);

        // menu navbar
        ImageButton nav = findViewById(R.id.navmenu);

        TextView tvInfo1 = findViewById(R.id.tvinfo1);
        String info1 ="Unlock the Future with STEM \n" +
                "- Personalized Just for You!";
        tvInfo1.setText(info1);
         TextView tvInfo2 = findViewById(R.id.tvinfo2);
         String info2 = "Empowering the next generation of girls in STEM through personalized \n" +
                 "learning paths that adapt to your passions, pace, and progress.";



        TextView info3 = findViewById(R.id.tvinfo3);
        String data3 = "With the right support, thriving in\n" +
                " your STEM career is easier than you \n" +
                "think";
        info3.setText(data3);

        // horizontal scroll view
        TextView career = findViewById(R.id.tvtitleicon1);
        String data4 = "Career";
        career.setText(data4);
// CAREER
        TextView careerinfo = findViewById(R.id.tvinfoicon1);
        String datacareer = "Explore various career paths in STEM, from software \n" +
                "development to environmental engineering. Find the best fit \n" +
                "for your skills and interests, and take the first step towards \n" +
                "a rewarding future.";
        careerinfo.setText(datacareer);

        TextView mentorshipTitle = findViewById(R.id.tvtitleicon2);
        String mentorTitle = "Mentorship";
        mentorshipTitle.setText(mentorTitle);
        // MENTORSHIP

        TextView mentorshipInfo = findViewById(R.id.tvinfoicon2);
        String mInfo = "Connect with experienced professionals who can guide you \n" +
                "through your STEM journey. Learn from their experiences, get \n" +
                "valuable advice, and gain insights that will help you succeed in \n" +
                "your chosen field.\n" +
                "\n";
        mentorshipInfo.setText(mInfo);

        //SCHOLARSHIPS

        TextView scolarshipTitle = findViewById(R.id.tvtitleicon3);
        String sTitle = "Scholarships";
        scolarshipTitle.setText(sTitle);

        TextView scolarshipInfo = findViewById(R.id.tvinfoicon3);
        String sInfo = "Discover scholarship opportunities designed to support\n" +
                " women pursuing STEM education. Get financial assistance, \n" +
                "mentorship, and resources to help you achieve your academic\n" +
                " and professional goals.\n" +
                "\n";
        scolarshipInfo.setText(sInfo);

        // buttons for the scholarships and mentorships
        Button click = findViewById(R.id.clickmentorships);
        String infoBtn = "Connet To Mentors";
        click.setText(infoBtn);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent passToMentorship = new Intent(HomePage.this, Mentorships.class);
                startActivity(passToMentorship);
            }
        });
        Button clickBtn = findViewById(R.id.btnclicksholarships);
        String infoBtn2 = "Learn More";
        clickBtn.setText(infoBtn2);

        clickBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent passToScholarships = new Intent(HomePage.this, Sholarships.class);
                startActivity(passToScholarships);
            }
        });

        // button
        Button clickToCareerPath = findViewById(R.id.btnclickcareer);
        String dataOne = "Discover Your Career Path";
        clickToCareerPath.setText(dataOne);

        clickToCareerPath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent passToCareerPath = new Intent(HomePage.this, CareerPath.class);
                startActivity(passToCareerPath);
            }
        });












    }
}
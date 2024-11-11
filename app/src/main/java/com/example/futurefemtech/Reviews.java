package com.example.futurefemtech;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Reviews extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_reviews);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        TextView titleReviews = findViewById(R.id.titleReviews);
        String benefitsInfo = "STEM Girls Reviews";
        titleReviews.setText(benefitsInfo);

        TextView name001 = findViewById(R.id.name001);
        String data001 =  "Li Wei";
        name001.setText(data001);


        TextView reviews001 = findViewById(R.id.reviews001);
        String data002 =  "I just love how this platform is tailored for women in STEM! The coding challenges and workshops have helped me improve my programming skills so much. The discussions on balancing work and life, especially for women, are really eye-opening. This site makes me feel that I can thrive in this field without sacrificing my personal life.";
        reviews001.setText(data002);


        TextView name002 = findViewById(R.id.name002);
        String data003 =  "Maria Gonzalez";
        name002.setText(data003);


        TextView reviews002 = findViewById(R.id.reviews002);
        String data004 =  "As someone passionate about environmental science, it’s refreshing to find a space dedicated to women like me. The articles and webinars on environmental issues have given me new insights and a sense of purpose. It’s empowering to know that there are so many women working to make a positive impact on the planet. This site keeps me inspired and motivated every day!";
        reviews002.setText(data004);


        TextView name003 = findViewById(R.id.name003);
        String data005 =  "Nia Johnson";
        name003.setText(data005);


        TextView reviews003 = findViewById(R.id.reviews003);
        String data006 =  "This website has been a game-changer for me! I was struggling to find resources and mentors in data science, but through this platform, I connected with incredible women who’ve guided me through every step of my career. The articles are so practical, and I’ve learned new techniques that I can apply in my work. I feel empowered and connected to a strong community of women who understand the journey.";
        reviews003.setText(data006);

        TextView name004 = findViewById(R.id.name004);
        String data007 =  "Adaku Okafor";
        name004.setText(data007);


        TextView reviews004 = findViewById(R.id.reviews004);
        String data008 = "I never thought I’d find a place where I could read stories from women in mechanical engineering who’ve faced the same challenges as me. The advice on handling workplace dynamics and gaining hands-on experience has been invaluable. This site is like having a big sister who’s been there before, cheering you on every step of the way!";
        reviews004.setText(data008);


        TextView name005 = findViewById(R.id.name005);
        String data009 =  "Wanjiru Mwangi";
        name005.setText(data009);


        TextView reviews005 = findViewById(R.id.reviews005);
        String data010 =  "The resources on this site have helped me tremendously as a young researcher. From grant writing tips to advice on networking, it’s a treasure trove of information that I didn’t have access to before. Seeing other women sharing their journeys has encouraged me to stay resilient and pursue my dreams in biomedical research.";
        reviews005.setText(data010);
    }
}
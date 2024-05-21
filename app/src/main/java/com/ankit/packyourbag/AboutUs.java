package com.ankit.packyourbag;

import static java.util.logging.Level.parse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class AboutUs extends AppCompatActivity {

    ImageView imgYoutube, imgInstagram, imgTwitter;
    TextView txtEmail, txtWebsiteUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("About us");

        imgYoutube=findViewById(R.id.imgYoutube);
        txtEmail=findViewById(R.id.txtEmail);
        txtWebsiteUrl=findViewById(R.id.txtWebsiteUrl);
        imgInstagram=findViewById(R.id.imgInstragram);
        imgTwitter=findViewById(R.id.imgTwitter);

        imgYoutube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToUrl("https://www.youtube.com/@ankitsahu2305/featured");
            }
        });

        txtEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:"+"ankitsahu2032@gmail.com"));
                    intent.putExtra(Intent.EXTRA_SUBJECT, "From Pack Your Bag");
                    startActivity(intent);
                }catch(ActivityNotFoundException e){
                    System.out.println(e);
                }
            }
        });

        txtWebsiteUrl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToUrl("https://www.linkedin.com/in/ankit-sahu-131601204/");
            }
        });

        imgInstagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToUrl("https://www.instagram.com/ankit_sahu2030/");
            }
        });

        imgTwitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToUrl("https://twitter.com/Ankit_sahu1234");
            }
        });
    }

    private void navigateToUrl(String url){
        Intent intent=new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
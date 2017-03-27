package com.example.rr.division_of_bangladesh;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RajshahiActivity extends AppCompatActivity {
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rajshahi);
        txt=(TextView)findViewById(R.id.textViewClickKhulna);
        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tripadvisor.in/Attractions-g667482-Activities-Rajshahi_Division.html"));
                startActivity(in);
            }
        });
    }
}

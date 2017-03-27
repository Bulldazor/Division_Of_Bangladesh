package com.example.rr.division_of_bangladesh;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RangpurActivity extends AppCompatActivity {
    TextView txtRang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rangpur);
        txtRang=(TextView)findViewById(R.id.textViewRangpur);
        txtRang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tripadvisor.com/ShowUserReviews-g667999-d7740423-r290946667-Tajhat_Palace-Rangpur_Rajshahi_Division.html"));
                startActivity(in);
            }
        });
    }
}

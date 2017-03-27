package com.example.rr.division_of_bangladesh;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class KhulnaActivity extends AppCompatActivity {
    TextView txtKhu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khulna);
        txtKhu=(TextView)findViewById(R.id.textViewClickKhulna);
        txtKhu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tripadvisor.com/Attractions-g667481-Activities-Khulna_Division.html"));
                startActivity(in);
            }
        });

    }
}

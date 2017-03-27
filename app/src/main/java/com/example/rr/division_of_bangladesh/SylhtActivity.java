package com.example.rr.division_of_bangladesh;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SylhtActivity extends AppCompatActivity {
    TextView txtSyhlt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sylht);
        txtSyhlt=(TextView)findViewById(R.id.textViewSylhtView);
        txtSyhlt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tripadvisor.co.uk/Attractions-g667997-Activities-Sylhet_City_Sylhet_Division.html"));
                startActivity(in);
            }
        });
    }
}

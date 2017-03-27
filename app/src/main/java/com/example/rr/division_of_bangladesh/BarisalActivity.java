package com.example.rr.division_of_bangladesh;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class BarisalActivity extends AppCompatActivity {
    TextView txtBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barisal);
        txtBar=(TextView)findViewById(R.id.textViewBar);
        txtBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Intent.ACTION_VIEW, Uri.parse("http://wikitravel.org/en/Barisal_Division"));
                startActivity(in);
            }
        });
    }
}

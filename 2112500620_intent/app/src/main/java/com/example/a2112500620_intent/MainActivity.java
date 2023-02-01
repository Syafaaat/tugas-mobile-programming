package com.example.a2112500620_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {

    Button explicitintent;
    Button implicitintent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        explicitintent = (Button)findViewById(R.id.explicit);
        explicitintent.setOnClickListener(this);
        implicitintent = (Button)findViewById(R.id.implicit);
        implicitintent.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.explicit:
                Intent explicit = new Intent(MainActivity.this, SecondActivity2.class);
                startActivity(explicit);
                break;
            case R.id.implicit:
                Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("https://elearning.budiluhur.ac.id"));
                startActivity(implicit);
                break;
            default:
                break;
        }
    }
}
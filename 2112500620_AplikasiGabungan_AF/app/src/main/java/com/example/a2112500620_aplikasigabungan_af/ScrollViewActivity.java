package com.example.a2112500620_aplikasigabungan_af;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ScrollViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_view);

        Button lolipop = (Button) findViewById(R.id.lolipop);
        Button marshmallow = (Button) findViewById(R.id.marshmallow);
        Button Nougat = (Button) findViewById(R.id.Nougat);
        Button oreo = (Button) findViewById(R.id.oreo);
        Button Pie = (Button) findViewById(R.id.Pie);
        Button ad10 = (Button) findViewById(R.id.ad10);
        Button ad11 = (Button) findViewById(R.id.ad11);
        Button ad12 = (Button) findViewById(R.id.ad12);
        Button ad13 = (Button) findViewById(R.id.ad13);

        lolipop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScrollViewActivity.this, LolipopActivity.class));
            }
        });

marshmallow.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        startActivity(new Intent(ScrollViewActivity.this, MarshmallowActivity.class));
    }
});

    Nougat.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(ScrollViewActivity.this, NougatActivity.class));
        }
    });

 oreo.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View view) {
         startActivity(new Intent(ScrollViewActivity.this, OreoActivity.class));
     }
 });

Pie.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        startActivity(new Intent(ScrollViewActivity.this, PieActivity.class));
    }
});

ad10.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        startActivity(new Intent(ScrollViewActivity.this,Android10Activity.class));
    }
});

ad11.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        startActivity(new Intent(ScrollViewActivity.this,Android11Activity.class));
    }
});

ad12.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        startActivity(new Intent(ScrollViewActivity.this, Android12Activity.class));
    }
});

ad13.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        startActivity(new Intent(ScrollViewActivity.this,Android13Activity.class));
    }
});

    }
}
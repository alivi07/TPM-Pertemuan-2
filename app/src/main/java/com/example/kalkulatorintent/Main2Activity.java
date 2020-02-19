package com.example.kalkulatorintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private Button kalkulator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        kalkulator = (Button) findViewById(R.id.kalkulator);
        TextView data = (TextView) findViewById(R.id.data_nama);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            String name = bundle.getString("nama");
            data.setText(name);
        }

        kalkulator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
                startActivity(intent);
            }
        });
    }
}

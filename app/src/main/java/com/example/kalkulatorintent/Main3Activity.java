package com.example.kalkulatorintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

     Button tambah,kurang,kali,bagi;
     EditText nilai1, nilai2;
     TextView tvhasil;
     String s1, s2;
     double a1,a2,hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        nilai1 = (EditText) findViewById(R.id.nilai1);
        nilai2 = (EditText) findViewById(R.id.nilai2);
        tambah = (Button) findViewById(R.id.tambah);
        kurang = (Button) findViewById(R.id.kurang);
        kali = (Button) findViewById(R.id.kali);
        bagi = (Button) findViewById(R.id.bagi);
        tvhasil = (TextView) findViewById(R.id.tvhasil);

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1 = nilai1.getText().toString();
                a1 = Double.parseDouble(s1);
                a2 = Double.parseDouble(nilai2.getText().toString());
                hasil = a1+a2;
                tvhasil.setText("" +hasil);
            }
        });
        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1 = nilai1.getText().toString();
                a1 = Double.parseDouble(s1);
                a2 = Double.parseDouble(nilai2.getText().toString());
                hasil = a1-a2;
                tvhasil.setText("" +hasil);
            }
        });
        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1 = nilai1.getText().toString();
                a1 = Double.parseDouble(s1);
                a2 = Double.parseDouble(nilai2.getText().toString());
                hasil = a1*a2;
                tvhasil.setText("" +hasil);
            }
        });
        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1 = nilai1.getText().toString();
                a1 = Double.parseDouble(s1);
                a2 = Double.parseDouble(nilai2.getText().toString());
                hasil = a1/a2;
                tvhasil.setText("" +hasil);
            }
        });

    }

}

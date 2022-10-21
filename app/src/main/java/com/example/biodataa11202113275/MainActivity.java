package com.example.biodataa11202113275;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void alamat(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Jl.+Kemuning+IV+No.16,+Brumbungan,+Kec.+Semarang+Tengah,+Kota+Semarang,+Jawa+Tengah+50135/@-6.985001,110.4226469,17z/data=!4m5!3m4!1s0x2e708b57f36f696f:0xe9c3465c419de1cd!8m2!3d-6.9850063!4d110.4248356"));
        startActivity(intent);
    }
    public void email(View view) {
        Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:matthewraymond.dev@gmail.com"));
        startActivity(intent);
    }
    public void telepon(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:087712346050"));
        startActivity(intent);
    }
}
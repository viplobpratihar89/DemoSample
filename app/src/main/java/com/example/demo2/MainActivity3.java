package com.example.demo2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        ImageView image=  (ImageView)findViewById(R.id.image);
        Glide
                .with(this)
                .load("data:image/jpeg;base64,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")
                .centerCrop()
                .placeholder(R.drawable.loader1)
                .into(image);

    }

    public void goBack(View view) {
        Intent intent =new Intent(MainActivity3.this,MainActivity2.class);
        startActivity(intent);
    }
}
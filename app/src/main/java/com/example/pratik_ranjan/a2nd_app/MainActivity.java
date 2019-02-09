package com.example.pratik_ranjan.a2nd_app;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void newCat(View view){
        ImageView image = (ImageView) findViewById(R.id.test_image);
        image.setImageResource(R.drawable.cat2);
        Log.i("Test","Button clicked");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

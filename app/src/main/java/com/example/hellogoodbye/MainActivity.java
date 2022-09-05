package com.example.hellogoodbye;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.clickme_btn1);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View Button) {
                // Do something in response to button click
            }
        });


    }
}
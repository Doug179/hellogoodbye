package com.example.hellogoodbye;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Boolean hello=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.clickme_btn1);
        TextView textviewhello = (TextView)  findViewById(R.id.hello_tv1);
        TextView textviewgoodbye = (TextView)  findViewById(R.id.goodbye_tv1);
        ImageView imageviewhello = (ImageView)  findViewById(R.id.hello_img);
        ImageView imageviewgoodbye = (ImageView)  findViewById(R.id.goodbye_img);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Log.i("Doug","button clicked");
                hello=!hello;

                if(hello) {
                    textviewhello.setVisibility(View.VISIBLE);
                    imageviewhello.setVisibility(View.VISIBLE);
                    textviewgoodbye.setVisibility(View.INVISIBLE);
                    imageviewgoodbye.setVisibility(View.INVISIBLE);
                }
                    else {
                    textviewhello.setVisibility(View.INVISIBLE);
                    imageviewhello.setVisibility(View.INVISIBLE);
                    textviewgoodbye.setVisibility(View.VISIBLE);
                    imageviewgoodbye.setVisibility(View.VISIBLE);
                }
                }
            }
        );


    }
}
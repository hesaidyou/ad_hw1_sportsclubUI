package com.example.liuyang.homework1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Coach extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coach);

        Button button1 = (Button) findViewById(R.id.bottom1);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Coach.this,MyAccount.class);
                startActivity(intent);
            }
        });

        Button button3 = (Button) findViewById(R.id.bottom3);
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Coach.this,World.class);
                startActivity(intent);
            }
        });

        Button button4 = (Button) findViewById(R.id.bottom4);
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Coach.this,Myself.class);
                startActivity(intent);
            }
        });
    }
}

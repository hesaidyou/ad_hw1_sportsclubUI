package com.example.liuyang.homework1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class World extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_world);

        Button button1 = (Button) findViewById(R.id.bottom1);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(World.this,MyAccount.class);
                startActivity(intent);
            }
        });

        Button button2 = (Button) findViewById(R.id.bottom2);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(World.this,Coach.class);
                startActivity(intent);
            }
        });

        Button button4 = (Button) findViewById(R.id.bottom4);
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(World.this,Myself.class);
                startActivity(intent);
            }
        });
    }
}

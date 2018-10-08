package com.example.liuyang.homework1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log_in_layout);

        Button button1 = (Button) findViewById(R.id.login_button);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(LoginActivity.this,MyAccount.class);
                startActivity(intent);
            }
        });

        Button button2 = (Button) findViewById(R.id.register_button);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(LoginActivity.this,Register.class);
                startActivity(intent);
            }
        });
    }
}

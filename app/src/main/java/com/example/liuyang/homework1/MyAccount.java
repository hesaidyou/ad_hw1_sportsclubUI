package com.example.liuyang.homework1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MyAccount extends AppCompatActivity {

    private String[] data = {"跑步  时间：周五 17：00 教练：Tony","深蹲  时间：周六 9：00 教练：Sam","卧推  时间：周日15：00 教练：Vian"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_account);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                MyAccount.this,android.R.layout.simple_list_item_1,data);
        ListView listview = (ListView) findViewById(R.id.listview_myclass);
        listview.setAdapter(adapter);

        Button button2 = (Button) findViewById(R.id.bottom2);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MyAccount.this,Coach.class);
                startActivity(intent);
            }
        });

        Button button3 = (Button) findViewById(R.id.bottom3);
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MyAccount.this,World.class);
                startActivity(intent);
            }
        });

        Button button4 = (Button) findViewById(R.id.bottom4);
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MyAccount.this,Myself.class);
                startActivity(intent);
            }
        });
    }
}

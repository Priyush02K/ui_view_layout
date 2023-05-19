package com.example.ui_view_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView recerview_msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        recerview_msg=findViewById(R.id.received_value_id);
        Intent intent=getIntent();
        String str=intent.getStringExtra("message_key");
        String strr=intent.getStringExtra("message_key");
       recerview_msg.setText(str);
       recerview_msg.setText(strr);

    }
}
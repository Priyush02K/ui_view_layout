package com.example.ui_view_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText username;
    EditText passwaorld;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username=findViewById(R.id.edittext1);
        passwaorld=findViewById(R.id.edittext2);
        button=findViewById(R.id.my_button);

        button.setOnClickListener(view ->{
            String str= username.getText().toString();
            String strr= passwaorld.getText().toString();
            Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
            intent.putExtra("message_key",str);
            intent.putExtra("message_key",strr);
            startActivity(intent);

        } );

    }


}
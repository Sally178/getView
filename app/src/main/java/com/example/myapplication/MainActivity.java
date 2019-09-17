package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView out;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//加载页面

        out = findViewById(R.id.output);
        out.setText("kkk");
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText input= findViewById(R.id.input);
                String str = input.getText().toString();
                out.setText(str);
            }
        });


    }

    @Override
    public void onClick(View view) {
        out.setText("aaa");
    }
    public void bbb(View b){
        out.setText("bbb");
    }
}

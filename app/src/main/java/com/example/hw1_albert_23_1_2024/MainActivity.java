package com.example.hw1_albert_23_1_2024;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView tv1,tv2,tv3,tv4,tv5,tv6;
    EditText ed1,ed2,ed3;
    ImageView iv1,iv2,iv3;
    Button btn1,btn2,btn3,anotherGame;
    Random rand = new Random();
    int num =0,temp = 0,ans = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        tv4 = findViewById(R.id.tv4);
        tv5 = findViewById(R.id.tv5);
        tv6 = findViewById(R.id.tv6);
        iv1 = findViewById(R.id.iv1);
        iv2 = findViewById(R.id.iv2);
        iv3 = findViewById(R.id.iv3);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        anotherGame = findViewById(R.id.anotherGame);
        ed1 = (EditText) findViewById(R.id.ed1);
        ed2 = (EditText) findViewById(R.id.ed2);
        ed3 = (EditText) findViewById(R.id.ed3);

        num = rand.nextInt(99)+10;
        tv1.setText(""+num);
        temp = rand.nextInt(99)+10;
        tv2.setText(""+temp);

    }

    public void first(View view) {
        String st = ed1.getText().toString();
        ans = Integer.parseInt(st);
        tv3.setVisibility(View.VISIBLE);
        tv4.setVisibility(View.VISIBLE);
        tv3.setText(""+ans);
        temp = rand.nextInt(99)+10;
        tv4.setText(""+temp);
        ed2.setVisibility(View.VISIBLE);
        iv2.setVisibility(View.VISIBLE);
        btn2.setVisibility(View.VISIBLE);

    }
}
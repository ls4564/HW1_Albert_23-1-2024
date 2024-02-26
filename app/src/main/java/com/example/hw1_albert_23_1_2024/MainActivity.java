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
    int num =0,temp = 0,sum =0,ans = 0,dog = 0,bob =0,count = 0;
    int num1 = 0,num2 = 0,num3 = 0,num4 = 0,num5 = 0,num6 = 0;
    int ans1 = 0,ans2 = 0,ans3 = 0;

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
        anotherGame = findViewById(R.id.Enter);
        ed1 = (EditText) findViewById(R.id.ed1);
        ed2 = (EditText) findViewById(R.id.ed2);
        ed3 = (EditText) findViewById(R.id.ed3);

        num1 = rand.nextInt(89)+10;
        tv1.setText(""+num1);
        num2 = rand.nextInt(89)+10;
        tv2.setText(""+num2);

    }

    public void first(View view) {
        String st = ed1.getText().toString();
        if(!st.isEmpty())
        {
            ans1 = Integer.parseInt(st);
            if (num1 + num2 == ans1) {
                iv1.setImageResource(R.drawable.img2_albert_23_1_24);
                count++;
            } else {
                iv1.setImageResource(R.drawable.img1_albert_23_1_24);
            }
            iv1.setVisibility(View.VISIBLE);
            tv3.setVisibility(View.VISIBLE);
            tv4.setVisibility(View.VISIBLE);
            sum = num + temp;
            tv4.setText("" + ans1);
            num4 = rand.nextInt(89) + 10;
            tv4.setText("" + num4);
            ed2.setVisibility(View.VISIBLE);
            btn2.setVisibility(View.VISIBLE);
        }
    }

    public void second(View view) {
        String st = ed2.getText().toString();
        if(!st.isEmpty()) {
            ans2 = Integer.parseInt(st);
            if (ans1 + num4 == ans2) {
                iv2.setImageResource(R.drawable.img2_albert_23_1_24);
                count++;
            } else {
                iv2.setImageResource(R.drawable.img1_albert_23_1_24);
            }
            iv2.setVisibility(View.VISIBLE);
            tv5.setVisibility(View.VISIBLE);
            tv6.setVisibility(View.VISIBLE);
            tv5.setText("" + ans2);
            num6 = rand.nextInt(89) + 10;
            tv6.setText("" + num6);
            ed3.setVisibility(View.VISIBLE);
            btn3.setVisibility(View.VISIBLE);
        }
    }
    public void third(View view) {
        String st = ed3.getText().toString();
        if(!st.isEmpty())
        {
            ans3 = Integer.parseInt(st);
            if (ans2 + num6 == ans3) {
                iv3.setImageResource(R.drawable.img2_albert_23_1_24);
                count++;
            } else {
                iv3.setImageResource(R.drawable.img1_albert_23_1_24);
            }
            iv3.setVisibility(View.VISIBLE);
            anotherGame.setVisibility(View.VISIBLE);
            switch (count) {
                case 0:
                    anotherGame.setText("(0% ,0/3)");
                    break;
                case 1:
                    anotherGame.setText("(33% ,1/3)");
                    break;
                case 2:
                    anotherGame.setText("(66% ,2/3)");
                    break;
                case 3:
                    anotherGame.setText("(100% ,3/3)");
                    break;
            }
        }
    }


    public void anotherGame(View view) {
        tv3.setVisibility(View.INVISIBLE);
        tv4.setVisibility(View.INVISIBLE);
        ed2.setVisibility(View.INVISIBLE);
        iv2.setVisibility(View.INVISIBLE);
        btn2.setVisibility(View.INVISIBLE);
        tv5.setVisibility(View.INVISIBLE);
        tv6.setVisibility(View.INVISIBLE);
        ed3.setVisibility(View.INVISIBLE);
        iv3.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        iv1.setVisibility(View.INVISIBLE);
        anotherGame.setText("!!!Another Game!!!");
        ed1.setText("");
        ed2.setText("");
        ed3.setText("");
        anotherGame.setVisibility(View.INVISIBLE);
        count = 0;

        num1 = rand.nextInt(89)+10;
        tv1.setText(""+num1);
        num2 = rand.nextInt(89)+10;
        tv2.setText(""+num2);

    }
}
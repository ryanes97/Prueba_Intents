package com.example.evaluacionlabo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText mText1, mText2;

    private LinearLayout Linear1, Linear2, Linear3, Linear4, Linear5, Linear6, Linear7, Linear8, Linear9;

    private TextView txt1, txt2, txt3, txt4, txt5, txt6, txt7, txt8, txt9;

    private int c1, c2, c3, c4 ,c5 ,c6 , c7, c8, c9, cT;

    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c1 = 0;
        c2 = 0;
        c3 = 0;
        c4 = 0;
        c5 = 0;
        c6 = 0;
        c7 = 0;
        c8 = 0;
        c9 = 0;
        cT = 0;

        btn = findViewById(R.id.send);
        mText1 = findViewById(R.id.email);
        mText2 = findViewById(R.id.user);

        Linear1 = findViewById(R.id.linear1);
        Linear2 = findViewById(R.id.linear2);
        Linear3 = findViewById(R.id.linear3);
        Linear4 = findViewById(R.id.linear4);
        Linear5 = findViewById(R.id.linear5);
        Linear6 = findViewById(R.id.linear6);
        Linear7 = findViewById(R.id.linear7);
        Linear8 = findViewById(R.id.linear8);
        Linear9 = findViewById(R.id.linear9);

        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);
        txt3 = findViewById(R.id.txt3);
        txt4 = findViewById(R.id.txt4);
        txt5 = findViewById(R.id.txt5);
        txt6 = findViewById(R.id.txt6);
        txt7 = findViewById(R.id.txt7);
        txt8 = findViewById(R.id.txt8);
        txt9 = findViewById(R.id.txt9);


        Linear1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c1++;
                txt1.setText(Integer.toString(c1));
            }
        });

        Linear2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c2++;
                txt2.setText(Integer.toString(c2));
            }
        });

        Linear3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c3++;
                txt3.setText(Integer.toString(c3));
            }
        });

        Linear4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c4++;
                txt4.setText(Integer.toString(c4));
            }
        });

        Linear5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c5++;
                txt5.setText(Integer.toString(c5));
            }
        });

        Linear6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c6++;
                txt6.setText(Integer.toString(c6));
            }
        });

        Linear7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c7++;
                txt7.setText(Integer.toString(c7));
            }
        });

        Linear8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c8++;
                txt8.setText(Integer.toString(c8));
            }
        });

        Linear9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c9++;
                txt9.setText(Integer.toString(c9));
            }
        });



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int total = c1 + c2 + c3 + c4 + c5 + c6 + c7 + c8 + c9;
                Intent mIntent = new Intent(MainActivity.this, SecondActivity.class);
                mIntent.putExtra("1", txt1.getText().toString());
                mIntent.putExtra("2", txt2.getText().toString());
                mIntent.putExtra("3", txt3.getText().toString());
                mIntent.putExtra("4", txt4.getText().toString());
                mIntent.putExtra("5", txt5.getText().toString());
                mIntent.putExtra("6", txt6.getText().toString());
                mIntent.putExtra("7", txt7.getText().toString());
                mIntent.putExtra("8", txt8.getText().toString());
                mIntent.putExtra("9", txt9.getText().toString());
                mIntent.putExtra("name", mText1.getText().toString());
                mIntent.putExtra("email", mText2.getText().toString());
                mIntent.putExtra("total", total+"");
                startActivity(mIntent);
            }
        });

    }
}

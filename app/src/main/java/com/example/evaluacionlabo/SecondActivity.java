    package com.example.evaluacionlabo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

    public class SecondActivity extends AppCompatActivity {

    private TextView mTextView, mTextView2, mTextView3, txt1, txt2, txt3, txt4, txt5, txt6, txt7, txt8, txt9;

    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent mIntent = getIntent();

        mTextView = findViewById(R.id.user1);
        mTextView2 = findViewById(R.id.user2);
        mTextView3 = findViewById(R.id.user3);

        btn = findViewById(R.id.share);

        txt1 = findViewById(R.id.txt_1);
        txt2 = findViewById(R.id.txt_2);
        txt3 = findViewById(R.id.txt_3);
        txt4 = findViewById(R.id.txt_4);
        txt5 = findViewById(R.id.txt_5);
        txt6 = findViewById(R.id.txt_6);
        txt7 = findViewById(R.id.txt_7);
        txt8 = findViewById(R.id.txt_8);
        txt9 = findViewById(R.id.txt_9);


        if(mIntent!=null){
            String cont = mIntent.getStringExtra("total");
            String name = mIntent.getStringExtra("name");
            String email = mIntent.getStringExtra("email");
            String one = mIntent.getStringExtra("1");
            String two = mIntent.getStringExtra("2");
            String three = mIntent.getStringExtra("3");
            String four = mIntent.getStringExtra("4");
            String five = mIntent.getStringExtra("5");
            String six = mIntent.getStringExtra("6");
            String seven = mIntent.getStringExtra("7");
            String eight = mIntent.getStringExtra("8");
            String nine = mIntent.getStringExtra("9");



            mTextView.setText(name);
            mTextView2.setText(email);
            mTextView3.setText(cont);
            txt1.setText(one);
            txt2.setText(two);
            txt3.setText(three);
            txt4.setText(four);
            txt5.setText(five);
            txt6.setText(six);
            txt7.setText(seven);
            txt8.setText(eight);
            txt9.setText(nine);


        }

        btn.setOnClickListener(v->{
            Intent mIntentShare = new Intent();
            mIntentShare.setAction(Intent.ACTION_SEND);
            mIntentShare.setType("text/plain");
            mIntentShare.putExtra(Intent.EXTRA_TEXT, "Usuario: " + mTextView.getText().toString() + " Correo: " + mTextView2.getText().toString() + " Total Productos: " + mTextView3.getText().toString());
            startActivity(mIntentShare);
        });




    }
}

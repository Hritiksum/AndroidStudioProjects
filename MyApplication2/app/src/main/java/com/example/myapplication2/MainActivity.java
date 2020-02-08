package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.EditText;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button mybtn1 = (Button) findViewById(R.id.mybtn1);
        final TextView mytext2 = (TextView) findViewById(R.id.mytext2);
        mybtn1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view)
            {
                TextView mytext1 = (TextView) findViewById(R.id.mytext1);
                EditText mynum1 = (EditText) findViewById(R.id.mynum1);
                EditText mynum2 = (EditText) findViewById(R.id.mynum2);
                int a,b;
                try {
                    //  Block of code to try
                    a = Integer.parseInt(mynum1.getText().toString());

                }
                catch(Exception e) {
                    //  Block of code to handle errors
                    a = 0;
                }
                try {
                    //  Block of code to try
                    b = Integer.parseInt(mynum2.getText().toString());

                }
                catch(Exception e) {
                    //  Block of code to handle errors
                    b = 0;
                }
                final int ans = a+b;
                String res = Integer.toString(ans);
                mytext2.setText(res);
                Toast.makeText(getApplicationContext(),res,Toast.LENGTH_LONG);
            }
        });
    }
}

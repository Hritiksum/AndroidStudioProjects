package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.view.View.OnClickListener;
import static android.content.Intent.ACTION_VIEW;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button mybtn = (Button) findViewById(R.id.mybtn);
        final EditText myurl = (EditText) findViewById(R.id.myurl);
        mybtn.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Url loading...", Toast.LENGTH_LONG).show();
                String query = myurl.getText().toString();
                String url ="https://urldetectorpro.herokuapp.com/api?query=";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url+query));
                startActivity(intent);
            }
        });
    }
}



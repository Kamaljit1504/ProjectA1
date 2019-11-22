package com.example.projecta1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView txtView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtView = findViewById(R.id.txtName);
        //R.string.Welcome;
        //String str = "hello World";
        //txtView.setText(R.string.Welcome);
        //android.R.
        String str= getResources().getString(R.string.Welcome) + " , Kamal";
        txtView.setText(str);
    }
}

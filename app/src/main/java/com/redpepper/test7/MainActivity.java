package com.redpepper.test7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button mButton1,mButton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton2=(Button)findViewById(R.id.button2);
        mButton1=(Button)findViewById(R.id.button1);
    }

}

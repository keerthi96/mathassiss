package com.example.keerthi.mathassiss;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

import com.example.keerthi.mathassiss.R;
public class MainActivity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        // Do something in response to button
        public void sendMessage(View view) {
            Intent intent;
            intent = new Intent(this, Activity2.class);
            startActivity(intent);
        }
    public void sendMessage1(View view) {
        Intent intent;
        intent = new Intent(this, Activity3.class);
        startActivity(intent);
    }
    public void sendMessage2(View view) {
        Intent intent;
        intent = new Intent(this, Activity4.class);
        startActivity(intent);
    }
    public void quiz(View view)
    {
        Intent intent;
        intent = new Intent(this, Quiz.class);
        startActivity(intent);
    }
    public void sendMessage3(View view) {
        Intent intent;
        intent = new Intent(this, Activity5.class);
        startActivity(intent);
    }
    public void sendMessage4(View view) {
        Intent intent;
        intent = new Intent(this, Adminlogin.class);
        startActivity(intent);
    }



}

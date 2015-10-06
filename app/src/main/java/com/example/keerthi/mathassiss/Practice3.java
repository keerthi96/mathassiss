package com.example.keerthi.mathassiss;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Practice3 extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,badd,beq,bres;
    EditText et;
    EditText et1;
    EditText res;
    int val1,val2;
    boolean add=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice3);
        b1=(Button) findViewById(R.id.b1);
        b2=(Button) findViewById(R.id.b2);
        b3=(Button) findViewById(R.id.b3);
        b4=(Button) findViewById(R.id.b4);
        b5=(Button) findViewById(R.id.b5);
        b6=(Button) findViewById(R.id.b6);
        b7=(Button) findViewById(R.id.b7);
        b8=(Button) findViewById(R.id.b8);
        b9=(Button) findViewById(R.id.b9);
        b0=(Button) findViewById(R.id.b0);

        badd=(Button) findViewById(R.id.badd);


        bres=(Button) findViewById(R.id.bres);
        beq=(Button) findViewById(R.id.beq);

        et=(EditText) findViewById(R.id.etNum1);
        et1=(EditText) findViewById(R.id.etNum2);
        res=(EditText) findViewById(R.id.tvResult);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(add==false)
                    et.setText(et.getText() + "1");
                else
                    et1.setText(et1.getText() + "1");


            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub


                if(add==false)
                    et.setText(et.getText() + "2");
                else
                    et1.setText(et1.getText() + "2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(add==false)
                    et.setText(et.getText() + "3");
                else
                    et1.setText(et1.getText() + "3");

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                if(add==false)
                    et.setText(et.getText() + "4");
                else
                    et1.setText(et1.getText() + "4");

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                if(add==false)
                    et.setText(et.getText() + "5");
                else
                    et1.setText(et1.getText() + "5");

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                if(add==false)
                    et.setText(et.getText() + "6");
                else
                    et1.setText(et1.getText() + "6");

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                if(add==false)
                    et.setText(et.getText() + "7");
                else
                    et1.setText(et1.getText() + "7");

            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                if(add==false)
                    et.setText(et.getText() + "8");
                else
                    et1.setText(et1.getText() + "8");

            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                if(add==false)
                    et.setText(et.getText() + "9");
                else
                    et1.setText(et1.getText() + "9");

            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                if(add==false)
                    et.setText(et.getText() + "0");
                else
                    et1.setText(et1.getText() + "0");

            }
        });

        badd.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                val1=Integer.parseInt(et.getText()+"");
                add=true;
                // et.setText("");

            }
        });


        beq.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                val2=Integer.parseInt(et1.getText()+"");
                if (add==true) {
                    res.setText(val1*val2+"");
                    add=false;
                }

            }

        });
        bres.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                res.setText("");

                et.setText("");
                et1.setText("");


            }


        });



    }


}
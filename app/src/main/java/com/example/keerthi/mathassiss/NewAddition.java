package com.example.keerthi.mathassiss;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class NewAddition extends AppCompatActivity {
    EditText question;
    EditText option1;
    EditText option2;
    EditText option3;
    EditText answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_addition);


        question = (EditText) findViewById(R.id.question);
        option1 = (EditText) findViewById(R.id.option1);
        option2 = (EditText) findViewById(R.id.Option2);
        option3 = (EditText) findViewById(R.id.Option3);
        answer = (EditText) findViewById(R.id.Answer);
    }


    public void addNewAddition(View view) {
        Question q=new Question();
        q.setQUESTION(question.getText().toString());
        q.setOPTA(option1.getText().toString());
        q.setOPTB(option2.getText().toString());
        q.setOPTC(option3.getText().toString());
        q.setANSWER(answer.getText().toString());
        DbHelper db=new DbHelper(this);
        db.addQuestionn(q);
        Intent intent = new Intent(NewAddition.this, MainActivity2.class);
        startActivity(intent);



    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_new_addition, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

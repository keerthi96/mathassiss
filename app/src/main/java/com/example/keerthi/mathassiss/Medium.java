package com.example.keerthi.mathassiss;
import java.util.List;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;
public class Medium extends Activity {
    List<Question> quesList;
    int score=0;
    int i=0;
    Question currentQ;
    TextView sco,num;
    TextView txtQuestion,time;
    RadioButton rda, rdb, rdc;
    Button butNext;
    DbHelper db=new DbHelper(this);
    final int[] solutionArray = new int[10];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medium);

        for (int i = 0; i < 10; i++) {
            solutionArray[i] = i;
        }

        shuffleArray(solutionArray);


        // Implementing Fisher–Yates shuffle
        i=0;
        quesList = db.getAllQuestions6();
        currentQ = quesList.get(solutionArray[i]);
        txtQuestion = (TextView) findViewById(R.id.textView1);
        time = (TextView) findViewById(R.id.timer);
        num = (TextView) findViewById(R.id.num);
        sco = (TextView) findViewById(R.id.score);

        rda = (RadioButton) findViewById(R.id.radio0);
        rdb = (RadioButton) findViewById(R.id.radio1);
        rdc = (RadioButton) findViewById(R.id.radio2);
        butNext = (Button) findViewById(R.id.button1);
        setQuestionView();
        new CountDownTimer(180000, 1000) {

            public void onTick(long millisUntilFinished) {

                time.setText(millisUntilFinished / 60000 + " mins " + (millisUntilFinished % 60000) / 1000 + " seconds remaining");
            }

            public void onFinish() {

                //the countdown timer has finished and the user failed to answer the question, so we move forward.
                Toast.makeText(Medium.this,"Oops!!Time up!!",Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Medium.this, ResultActivity.class);
                Bundle b = new Bundle();
                b.putInt("score", score);
                b.putInt("max", 5);//Your score
                intent.putExtras(b); //Put your score to your next Intent
                startActivity(intent);
                finish();

            }
        }.start();


        butNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioGroup grp=(RadioGroup)findViewById(R.id.radioGroup1);
                RadioButton answer=(RadioButton)findViewById(grp.getCheckedRadioButtonId());
                Log.d("yourans", currentQ.getANSWER()+" "+answer.getText());
                if(currentQ.getANSWER().equals(answer.getText()))
                {
                    score++;
                    Log.d("score", "Your score"+score);
                }
                if(i<5){
                    currentQ=quesList.get(solutionArray[i]);
                    setQuestionView();
                }else{
                    Intent intent = new Intent(Medium.this, ResultActivity.class);
                    Bundle b = new Bundle();
                    b.putInt("score", score);
                    b.putInt("max",i);//Your score
                    intent.putExtras(b); //Put your score to your next Intent
                    startActivity(intent);
                    finish();
                }
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
// Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_quiz, menu);
        return true;
    }
    private void setQuestionView()
    {
        txtQuestion.setText(" "+i+".  "+currentQ.getQUESTION());
        rda.setText(currentQ.getOPTA());
        rdb.setText(currentQ.getOPTB());
        rdc.setText(currentQ.getOPTC());
        num.setText("Question:"+i+"/5");
        sco.setText("Score:"+score);
        ++i;
    }
    static void shuffleArray(int[] ar)
    {
        Random rnd = new Random();
        for (int i = ar.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            int a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }
}
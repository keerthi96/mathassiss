package com.example.keerthi.mathassiss;





      import android.app.Activity;

        import android.os.Bundle;

        import android.content.Intent;

        import android.view.View;


        import android.widget.TextView;


public class MainActivity2 extends Activity {
    Intent intent;
    TextView quesId;
    DbHelper controller = new DbHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


    }
    public void showAddForm(View view) {
        Intent objIntent = new Intent(getApplicationContext(), NewAddition.class);
        startActivity(objIntent);
    }
    public void showSubForm(View view) {
        Intent objIntent = new Intent(getApplicationContext(), NewSub.class);
        startActivity(objIntent);
    }
    public void showMulForm(View view) {
        Intent objIntent = new Intent(getApplicationContext(), NewMul.class);
        startActivity(objIntent);
    }
    public void showDivForm(View view) {
        Intent objIntent = new Intent(getApplicationContext(), NewDiv.class);
        startActivity(objIntent);
    }
}

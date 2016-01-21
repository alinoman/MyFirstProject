package com.example.fatma.myfirstproject;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity {

    Button sumButton;
    EditText fNum,sNum,sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sumButton=(Button) findViewById(R.id.sumButton);
        fNum=(EditText) findViewById(R.id.firstNum);
        sNum=(EditText) findViewById(R.id.secondNum);
        sum=(EditText) findViewById(R.id.sumdNum);
        sumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int result=Integer.parseInt(fNum.getText().toString())+Integer.parseInt(sNum.getText().toString());
                sum.setText(""+result);

            }
        });
    }
}
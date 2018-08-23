package com.android.olga.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Olga on 18/06/01.
 */


public class Result extends AppCompatActivity {

    static int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);

        Bundle bundle = getIntent().getExtras();
        result = bundle.getInt("result");

        TextView tv = (TextView) findViewById(R.id.result_value);
        tv.setText(String.valueOf(result) + "/5");

        TextView tv2 = (TextView) findViewById(R.id.congrats);
        if (result < 2) {
            tv2.setText(R.string.congrats1);
        } else if (result == 2) {
            tv2.setText(R.string.congrats2);
        } else if (result < 4) {
            tv2.setText(R.string.congrats3);
        } else if (result == 4) {
            tv2.setText(R.string.congrats4);
        }
        Toast.makeText(Result.this, "Your result is " + result, Toast.LENGTH_LONG).show();
    }
}

package com.android.olga.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;


public class MainActivity extends AppCompatActivity {
    static int result = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button check = (Button) findViewById(R.id.button_next);
        check.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                RadioButton b1 = (RadioButton) findViewById(R.id.answer1_1);
                if (b1.isChecked()) {
                    result++;
                }
                Intent intent = new Intent(MainActivity.this, Question2.class);
                intent.putExtra("result", result);
                startActivity(intent);
            }
        });
    }

}

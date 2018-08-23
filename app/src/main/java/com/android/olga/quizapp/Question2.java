package com.android.olga.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

/**
 * Created by Olga on 18/06/01.
 */

public class Question2 extends AppCompatActivity {
    static int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.que2);

        Bundle bundle = getIntent().getExtras();
        result = bundle.getInt("result");


        Button check = (Button) findViewById(R.id.button_next);
        check.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                RadioButton b1 = (RadioButton) findViewById(R.id.answer2_2);
                if (b1.isChecked()) {
                    result++;
                }
                Intent intent = new Intent(Question2.this, Question3.class);
                intent.putExtra("result", result);
                startActivity(intent);
            }
        });
    }
}

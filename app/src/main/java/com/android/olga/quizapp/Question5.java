package com.android.olga.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Olga on 18/06/01.
 */

public class Question5 extends AppCompatActivity {

    static int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.que5);

        Bundle bundle = getIntent().getExtras();
        result = bundle.getInt("result");

        Button check = (Button) findViewById(R.id.button_next);
        check.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                TextView b1 = (TextView) findViewById(R.id.question5_answer);
                if (b1.getText().toString().equals("Anakin Skywalker")) {
                    result++;
                }
                Intent intent = new Intent(Question5.this, Result.class);
                intent.putExtra("result", result);
                startActivity(intent);
            }
        });
    }
}

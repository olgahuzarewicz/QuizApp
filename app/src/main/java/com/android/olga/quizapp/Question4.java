package com.android.olga.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

/**
 * Created by Olga on 18/06/01.
 */

public class Question4 extends AppCompatActivity {

    static int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.que4);

        Bundle bundle = getIntent().getExtras();
        result = bundle.getInt("result");

        Button check = (Button) findViewById(R.id.button_next);
        check.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                CheckBox b1 = (CheckBox) findViewById(R.id.answer4_1);
                CheckBox b2 = (CheckBox) findViewById(R.id.answer4_3);
                if (b1.isChecked() && b2.isChecked()) {
                    result++;
                }
                Intent intent = new Intent(Question4.this, Question5.class);
                intent.putExtra("result", result);
                startActivity(intent);
            }
        });
    }
}

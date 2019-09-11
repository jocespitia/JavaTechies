package com.example.diego.a343quiz;

import android.view.View;
import android.widget.Button;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;

public class Home extends AppCompatActivity {





    Button start_quiz, view_answer_key,quit;                    // Creating button class for
                                                                // the options to quit
                                                                // view answer key and start
                                                                // a new quiz.

    @Override
    protected void onCreate(Bundle savedInstanceState) {        // function to start this activity
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);                 // get the layout of the score page

        start_quiz = (Button) findViewById(R.id.start_quiz);    // setting the buttons to the
                                                                // appropriate id in the layout.

        view_answer_key = (Button) findViewById(R.id.view_answer_key);

        quit = (Button) findViewById(R.id.quit);




        start_quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {                       // sends the user to the
                                                                // quiz activity


                Intent myIntent = new Intent(Home.this, Quiz.class);

                startActivity(myIntent);
            }


        });

        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {                        // quits the app


               finish();
               System.exit(0);
            }


        });

        view_answer_key.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });



    }
}

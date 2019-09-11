package com.example.diego.a343quiz;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Score extends AppCompatActivity {

    Button start_new_quiz, view_answer_key,quit;                       // Creating button class for
                                                                       // the options to quit
                                                                       // view answer key and start
                                                                       // a new quiz.
    TextView scoreBoard;                                               // Creating the part where
                                                                       // the score will display



    @Override
    protected void onCreate(Bundle savedInstanceState) {         // function to start this activity
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);                 // get the layout of the score page


        scoreBoard = (TextView) findViewById(R.id.scoreBoard);       // setting the buttons to the
                                                                     // appropriate id in the layout
                                                                     // and text view.
        updateScore();
        start_new_quiz = (Button) findViewById(R.id.start_new_quiz);
        view_answer_key = (Button) findViewById(R.id.view_answer_key);
        quit = (Button) findViewById(R.id.Exit);


        start_new_quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {                   // send the user to the
                                                                    // quiz activity


                Intent myIntent = new Intent(Score.this, Quiz.class);

                startActivity(myIntent);
            }


        });

        quit.setOnClickListener(new View.OnClickListener() {        // function to quit app
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_MAIN);     // saves the last activity
                intent.addCategory(Intent.CATEGORY_HOME);           // i.e score activity
                startActivity(intent);                              // and when the app launches it
                                                                    // puts the user in the last
                                                                    // save activity which is
                                                                    // always the score page
            }


        });

        view_answer_key.setOnClickListener(new View.OnClickListener() { // still under development
            @Override
            public void onClick(View v) {

            }
        });


    }
    private void updateScore() {                                // to put the score after the 6
                                                                // questions

    Bundle bundle=getIntent().getExtras();                      // gets the number score form the
                                                                // quiz class here
    int value=bundle.getInt("no");
    String text = "the score is " + value;

    scoreBoard.setText(text.toCharArray(), 0, text.length()); // and displays it here
    }

}

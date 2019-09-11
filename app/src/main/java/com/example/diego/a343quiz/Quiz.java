package com.example.diego.a343quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Quiz extends AppCompatActivity {

    Button answer1, answer2, answer3, answer4;                      // Creating button class for
                                                                    // the choices on the quiz
    TextView question;                                              // Creating the part where
                                                                    // the question will display

    private Question nQuestions = new Question();                   // creation a question Object

    private String nAnswer;                                         // a string to store the answer
                                                                    // of the quiz from question
                                                                    // class
    private int nQuestionAmount = nQuestions.nQuestions.length;   // looking for how many questions
                                                                    // i have
    int score = 0;                                                  // calculating the score of the
                                                                    // user
    int counter = 0;                                                // variable to keep track on
                                                                    // what question i am
    Random r;                                                       // creating a random object to
                                                                    // randomize the questions

    @Override
    protected void onCreate(Bundle savedInstanceState) {         // function to start this activity
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);                     // get the layout of the quiz



        r = new Random();                                           // randomize a number here

        question = (TextView) findViewById(R.id.question);          // setting the buttons to the
                                                                    // appropriate id in the layout
                                                                    // and text view.
        answer1 = (Button) findViewById(R.id.answer1);
        answer2 = (Button) findViewById(R.id.answer2);
        answer3 = (Button) findViewById(R.id.answer3);
        answer4 = (Button) findViewById(R.id.answer4);

        if (counter == 0)                                           // to solve the problem why it
            updateQuestion(r.nextInt(nQuestionAmount));             // wasn't choosing the first
                                                                    // question




        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {                          // set clicker ready to see
                                                                    // if the first choice
                                                                    // was pressed
                if (answer1.getText() == nAnswer)
                    score++;


                counter++;
                updateQuestion(r.nextInt(nQuestionAmount));
            }
        });

        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {                         // set clicker ready to see
                                                                   // if the first choice
                                                                   // was pressed

                if (answer1.getText() == nAnswer)
                    score++;


                counter++;
                updateQuestion(r.nextInt(nQuestionAmount));



            }
        });


        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {                            // set clicker ready to see
                                                                      // if the first choice
                                                                      // was pressed

                if (answer1.getText() == nAnswer)
                    score++;

                counter++;
                updateQuestion(r.nextInt(nQuestionAmount));
            }
        });


        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {                            // set clicker ready to see
                                                                      // if the first choice
                                                                      // was pressed

                if (answer1.getText() == nAnswer)
                    score++;


                counter++;
                updateQuestion(r.nextInt(nQuestionAmount));
            }
        });
    }




    private void updateQuestion(int num) {                      // function were the question
                                                                // is fetch

        if (counter == nQuestions.getSizeOfQuestions()){        // if counter is equal to size of
                                                                // the array of questions that i
                                                                // have then send me to the score
                                                                // activity
            Intent myIntent = new Intent(Quiz.this, Score.class);
            myIntent.putExtra("no", score);
            startActivity(myIntent);
        }


        question.setText(nQuestions.getQuestion(num));          // fetching the question and the
                                                                // choices

        answer1.setText(nQuestions.getChoice1(num));
        answer2.setText(nQuestions.getChoice2(num));
        answer3.setText(nQuestions.getChoice3(num));
        answer4.setText(nQuestions.getChoice4(num));
        nAnswer = nQuestions.getAnswer(num);

    }
}

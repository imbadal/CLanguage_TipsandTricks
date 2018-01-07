package com.example.my_lenovo.clanguagetipsandtricks;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import in.uncod.android.bypass.Bypass;

public class MainActivity extends AppCompatActivity {

    private static TextView tutorials;
    private static TextView c_definations;
    private static TextView c_difference_between;
    private static TextView c_interview_questions;
    private static TextView c_output_questions;
    private static TextView c_programs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OnClickTextView();
        OnClickDefinations();
        OnClickDifferenceBetween();
        OnClickInterviewQuestions();
        OnClickOutputQuestions();
        OnClickPrograms();

    }


    public void OnClickTextView() {

        tutorials = (TextView) findViewById(R.id.textView8);
        tutorials.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.example.my_lenovo.clanguagetipsandtricks.Tutorials");
                startActivity(intent);
            }
        });

    }

    public void OnClickDefinations() {

        c_definations = (TextView) findViewById(R.id.definations);
        c_definations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.example.my_lenovo.clanguagetipsandtricks.Definations");
                startActivity(intent);
            }
        });

    }

    public void OnClickDifferenceBetween() {

        c_difference_between = (TextView) findViewById(R.id.differenceBetween);
        c_difference_between.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.example.my_lenovo.clanguagetipsandtricks.DifferenceBetween");
                startActivity(intent);
            }
        });

    }

    public void OnClickInterviewQuestions() {

        c_interview_questions = (TextView) findViewById(R.id.interviewQuestions);
        c_interview_questions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.example.my_lenovo.clanguagetipsandtricks.InterviewQuestions");
                startActivity(intent);
            }
        });

    }

    public void OnClickOutputQuestions() {

        c_output_questions = (TextView) findViewById(R.id.outputQuestions);
        c_output_questions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.example.my_lenovo.clanguagetipsandtricks.OutputQuestions");
                startActivity(intent);
            }
        });

    }

    public void OnClickPrograms() {

        c_programs = (TextView) findViewById(R.id.programs);
        c_programs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.example.my_lenovo.clanguagetipsandtricks.Programs");
                startActivity(intent);
            }
        });

    }
}

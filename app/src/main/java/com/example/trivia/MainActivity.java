package com.example.trivia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.trivia.Controller.AppController;
import com.example.trivia.Data.QuestionBank;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new QuestionBank().getQuestions();
    }
}

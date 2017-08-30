package com.example.gom.eyetestgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RankRegister extends AppCompatActivity {


    Button RegisterButton, RetryButton;
    EditText initialEdit, commentEdit;
    TextView myScoreText;
    String init,comment;
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rank_register);

        RegisterButton = (Button)findViewById(R.id.buttonRegister);

        initialEdit = (EditText)findViewById(R.id.initalText);
        commentEdit = (EditText)findViewById(R.id.commentText);
        myScoreText = (TextView)findViewById(R.id.myscore);
        RetryButton = (Button)findViewById(R.id.buttonRetry);
        RetryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RankRegister.this,choiceLevel.class);
                startActivity(intent);
            }
        });
        Intent intent = getIntent();
        score = intent.getIntExtra("score",1);
        myScoreText.setText("MY SCORE: "+score);


        RegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RankRegister.this,ranklistView.class);
                init = initialEdit.getText().toString();
                comment = commentEdit.getText().toString();

                intent.putExtra("init",init);
                intent.putExtra("comment",comment);
                intent.putExtra("score",score);

                startActivity(intent);
            }
        });


    }
}

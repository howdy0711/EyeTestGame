package com.example.gom.eyetestgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SingleItemView extends AppCompatActivity {


    TextView txtdate,txtid,txtscore,txtcomment;

    String date,id,TextComment;
    int score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_item_view);

        Intent i = getIntent();
        date = i.getStringExtra("date");
        id =  i.getStringExtra("id");
        score = i.getIntExtra("score",1);
        TextComment = i.getStringExtra("comment");

        txtdate = (TextView) findViewById(R.id.date);
        txtid = (TextView) findViewById(R.id.id);
        txtscore = (TextView) findViewById(R.id.score);
        txtcomment = (TextView)findViewById(R.id.comment) ;

        txtdate.setText(date);
        txtid.setText(id);
        txtcomment.setText(TextComment);
        txtscore.setText(score+"");
    }
}

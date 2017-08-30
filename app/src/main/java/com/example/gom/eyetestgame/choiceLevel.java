package com.example.gom.eyetestgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class choiceLevel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice_level);

        Button level1_b, level2_b, level3_b;


        level1_b = (Button) findViewById(R.id.level1_button);
        level2_b = (Button) findViewById(R.id.level2_button);
        level3_b = (Button) findViewById(R.id.level3_button);


        level1_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(choiceLevel.this,gameMain.class);
                startActivity(intent);
            }
        });

        level2_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(choiceLevel.this,gameMain_LevelTwo.class);
                startActivity(intent);
            }
        });

        level3_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(choiceLevel.this,gameMain_LevelThree.class);
                startActivity(intent);
            }
        });

    }

}

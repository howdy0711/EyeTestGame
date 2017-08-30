package com.example.gom.eyetestgame;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.util.Random;

public class gameMain_LevelThree extends AppCompatActivity
{

    Random rnd = new Random();
    Button btn;
    int number = 0;
    Button[] b;
    int i = 100;
    int score =0;
    TextView textView;
    ProgressBar pb;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_main__level_three);
        b = new Button[25];

        b[0] = (Button)findViewById(R.id.b11);
        b[1] = (Button)findViewById(R.id.b12);
        b[2] = (Button)findViewById(R.id.b13);
        b[3] = (Button)findViewById(R.id.b14);
        b[4] = (Button)findViewById(R.id.b15);


        b[5] = (Button)findViewById(R.id.b21);
        b[6] = (Button)findViewById(R.id.b22);
        b[7] = (Button)findViewById(R.id.b23);
        b[8] = (Button)findViewById(R.id.b24);
        b[9] = (Button)findViewById(R.id.b25);

        b[10] = (Button)findViewById(R.id.b31);
        b[11] = (Button)findViewById(R.id.b32);
        b[12] = (Button)findViewById(R.id.b33);
        b[13] = (Button)findViewById(R.id.b34);
        b[14] = (Button)findViewById(R.id.b35);

        b[15] = (Button)findViewById(R.id.b41);
        b[16] = (Button)findViewById(R.id.b42);
        b[17] = (Button)findViewById(R.id.b43);
        b[18] = (Button)findViewById(R.id.b44);
        b[19] = (Button)findViewById(R.id.b45);

        b[20] = (Button)findViewById(R.id.b51);
        b[21] = (Button)findViewById(R.id.b52);
        b[22] = (Button)findViewById(R.id.b53);
        b[23] = (Button)findViewById(R.id.b54);
        b[24] = (Button)findViewById(R.id.b55);


        startSubThread();
        textView = (TextView)findViewById(R.id.testText);
        pb = (ProgressBar) findViewById(R.id.progressBar1);



    }
    public void onClick(View v){
        score = score+25;
        textView.setText("MY SCORE: "+score);
    }
    Thread myThread;
    Thread myThread2;

    public void startSubThread()
    {
        //작업스레드 생성(매듭 묶는과정)
        MyRunnable myRunnable = new MyRunnable();
        myThread = new Thread(myRunnable);
        myThread.setDaemon(true);
        myThread.start();

    }



    android.os.Handler handler = new android.os.Handler()
    {
        public void handleMessage(Message msg)
        {
            if (msg.what == 0)
            {
                pb.incrementProgressBy(i);
            }
        };
    };

    android.os.Handler mainHandler = new android.os.Handler()
    {
        public void handleMessage(Message msg)
        {
            if (msg.what == 0)
            {
                pb.setProgress(i);
                switch (number){

                    case 0:
                        b[0].setVisibility(View.VISIBLE);
                        b[2].setVisibility(View.INVISIBLE);
                        b[1].setVisibility(View.INVISIBLE);
                        b[3].setVisibility(View.INVISIBLE);
                        b[4].setVisibility(View.INVISIBLE);


                        b[5].setVisibility(View.INVISIBLE);
                        b[6].setVisibility(View.INVISIBLE);
                        b[7].setVisibility(View.INVISIBLE);
                        b[8].setVisibility(View.INVISIBLE);
                        b[9].setVisibility(View.INVISIBLE);
                        b[10].setVisibility(View.INVISIBLE);
                        b[11].setVisibility(View.INVISIBLE);
                        b[12].setVisibility(View.INVISIBLE);
                        b[13].setVisibility(View.INVISIBLE);
                        b[14].setVisibility(View.INVISIBLE);
                        b[15].setVisibility(View.INVISIBLE);
                        b[16].setVisibility(View.INVISIBLE);
                        b[17].setVisibility(View.INVISIBLE);
                        b[18].setVisibility(View.INVISIBLE);
                        b[19].setVisibility(View.INVISIBLE);
                        b[20].setVisibility(View.INVISIBLE);
                        b[21].setVisibility(View.INVISIBLE);
                        b[22].setVisibility(View.INVISIBLE);
                        b[23].setVisibility(View.INVISIBLE);
                        b[24].setVisibility(View.INVISIBLE);
                        break;

                    case 1:
                        b[1].setVisibility(View.VISIBLE);
                        b[2].setVisibility(View.INVISIBLE);
                        b[0].setVisibility(View.INVISIBLE);
                        b[3].setVisibility(View.INVISIBLE);
                        b[4].setVisibility(View.INVISIBLE);


                        b[5].setVisibility(View.INVISIBLE);
                        b[6].setVisibility(View.INVISIBLE);
                        b[7].setVisibility(View.INVISIBLE);
                        b[8].setVisibility(View.INVISIBLE);
                        b[9].setVisibility(View.INVISIBLE);
                        b[10].setVisibility(View.INVISIBLE);
                        b[11].setVisibility(View.INVISIBLE);
                        b[12].setVisibility(View.INVISIBLE);
                        b[13].setVisibility(View.INVISIBLE);
                        b[14].setVisibility(View.INVISIBLE);
                        b[15].setVisibility(View.INVISIBLE);
                        b[16].setVisibility(View.INVISIBLE);
                        b[17].setVisibility(View.INVISIBLE);
                        b[18].setVisibility(View.INVISIBLE);
                        b[19].setVisibility(View.INVISIBLE);
                        b[20].setVisibility(View.INVISIBLE);
                        b[21].setVisibility(View.INVISIBLE);
                        b[22].setVisibility(View.INVISIBLE);
                        b[23].setVisibility(View.INVISIBLE);
                        b[24].setVisibility(View.INVISIBLE);
                        break;

                    case 2:
                        b[2].setVisibility(View.VISIBLE);
                        b[1].setVisibility(View.INVISIBLE);
                        b[0].setVisibility(View.INVISIBLE);
                        b[3].setVisibility(View.INVISIBLE);
                        b[4].setVisibility(View.INVISIBLE);


                        b[5].setVisibility(View.INVISIBLE);
                        b[6].setVisibility(View.INVISIBLE);
                        b[7].setVisibility(View.INVISIBLE);
                        b[8].setVisibility(View.INVISIBLE);
                        b[9].setVisibility(View.INVISIBLE);
                        b[10].setVisibility(View.INVISIBLE);
                        b[11].setVisibility(View.INVISIBLE);
                        b[12].setVisibility(View.INVISIBLE);
                        b[13].setVisibility(View.INVISIBLE);
                        b[14].setVisibility(View.INVISIBLE);
                        b[15].setVisibility(View.INVISIBLE);
                        b[16].setVisibility(View.INVISIBLE);
                        b[17].setVisibility(View.INVISIBLE);
                        b[18].setVisibility(View.INVISIBLE);
                        b[19].setVisibility(View.INVISIBLE);
                        b[20].setVisibility(View.INVISIBLE);
                        b[21].setVisibility(View.INVISIBLE);
                        b[22].setVisibility(View.INVISIBLE);
                        b[23].setVisibility(View.INVISIBLE);
                        b[24].setVisibility(View.INVISIBLE);
                        break;

                    case 3:
                        b[3].setVisibility(View.VISIBLE);
                        b[2].setVisibility(View.INVISIBLE);
                        b[1].setVisibility(View.INVISIBLE);
                        b[0].setVisibility(View.INVISIBLE);
                        b[4].setVisibility(View.INVISIBLE);


                        b[5].setVisibility(View.INVISIBLE);
                        b[6].setVisibility(View.INVISIBLE);
                        b[7].setVisibility(View.INVISIBLE);
                        b[8].setVisibility(View.INVISIBLE);
                        b[9].setVisibility(View.INVISIBLE);
                        b[10].setVisibility(View.INVISIBLE);
                        b[11].setVisibility(View.INVISIBLE);
                        b[12].setVisibility(View.INVISIBLE);
                        b[13].setVisibility(View.INVISIBLE);
                        b[14].setVisibility(View.INVISIBLE);
                        b[15].setVisibility(View.INVISIBLE);
                        b[16].setVisibility(View.INVISIBLE);
                        b[17].setVisibility(View.INVISIBLE);
                        b[18].setVisibility(View.INVISIBLE);
                        b[19].setVisibility(View.INVISIBLE);
                        b[20].setVisibility(View.INVISIBLE);
                        b[21].setVisibility(View.INVISIBLE);
                        b[22].setVisibility(View.INVISIBLE);
                        b[23].setVisibility(View.INVISIBLE);
                        b[24].setVisibility(View.INVISIBLE);
                        break;

                    case 4:
                        b[4].setVisibility(View.VISIBLE);
                        b[2].setVisibility(View.INVISIBLE);
                        b[1].setVisibility(View.INVISIBLE);
                        b[3].setVisibility(View.INVISIBLE);
                        b[0].setVisibility(View.INVISIBLE);


                        b[5].setVisibility(View.INVISIBLE);
                        b[6].setVisibility(View.INVISIBLE);
                        b[7].setVisibility(View.INVISIBLE);
                        b[8].setVisibility(View.INVISIBLE);
                        b[9].setVisibility(View.INVISIBLE);
                        b[10].setVisibility(View.INVISIBLE);
                        b[11].setVisibility(View.INVISIBLE);
                        b[12].setVisibility(View.INVISIBLE);
                        b[13].setVisibility(View.INVISIBLE);
                        b[14].setVisibility(View.INVISIBLE);
                        b[15].setVisibility(View.INVISIBLE);
                        b[16].setVisibility(View.INVISIBLE);
                        b[17].setVisibility(View.INVISIBLE);
                        b[18].setVisibility(View.INVISIBLE);
                        b[19].setVisibility(View.INVISIBLE);
                        b[20].setVisibility(View.INVISIBLE);
                        b[21].setVisibility(View.INVISIBLE);
                        b[22].setVisibility(View.INVISIBLE);
                        b[23].setVisibility(View.INVISIBLE);
                        b[24].setVisibility(View.INVISIBLE);
                        break;

                    case 5:
                        b[5].setVisibility(View.VISIBLE);
                        b[2].setVisibility(View.INVISIBLE);
                        b[1].setVisibility(View.INVISIBLE);
                        b[3].setVisibility(View.INVISIBLE);
                        b[4].setVisibility(View.INVISIBLE);


                        b[0].setVisibility(View.INVISIBLE);
                        b[6].setVisibility(View.INVISIBLE);
                        b[7].setVisibility(View.INVISIBLE);
                        b[8].setVisibility(View.INVISIBLE);
                        b[9].setVisibility(View.INVISIBLE);
                        b[10].setVisibility(View.INVISIBLE);
                        b[11].setVisibility(View.INVISIBLE);
                        b[12].setVisibility(View.INVISIBLE);
                        b[13].setVisibility(View.INVISIBLE);
                        b[14].setVisibility(View.INVISIBLE);
                        b[15].setVisibility(View.INVISIBLE);
                        b[16].setVisibility(View.INVISIBLE);
                        b[17].setVisibility(View.INVISIBLE);
                        b[18].setVisibility(View.INVISIBLE);
                        b[19].setVisibility(View.INVISIBLE);
                        b[20].setVisibility(View.INVISIBLE);
                        b[21].setVisibility(View.INVISIBLE);
                        b[22].setVisibility(View.INVISIBLE);
                        b[23].setVisibility(View.INVISIBLE);
                        b[24].setVisibility(View.INVISIBLE);
                        break;

                    case 6:
                        b[6].setVisibility(View.VISIBLE);
                        b[2].setVisibility(View.INVISIBLE);
                        b[1].setVisibility(View.INVISIBLE);
                        b[3].setVisibility(View.INVISIBLE);
                        b[4].setVisibility(View.INVISIBLE);


                        b[5].setVisibility(View.INVISIBLE);
                        b[0].setVisibility(View.INVISIBLE);
                        b[7].setVisibility(View.INVISIBLE);
                        b[8].setVisibility(View.INVISIBLE);
                        b[9].setVisibility(View.INVISIBLE);
                        b[10].setVisibility(View.INVISIBLE);
                        b[11].setVisibility(View.INVISIBLE);
                        b[12].setVisibility(View.INVISIBLE);
                        b[13].setVisibility(View.INVISIBLE);
                        b[14].setVisibility(View.INVISIBLE);
                        b[15].setVisibility(View.INVISIBLE);
                        b[16].setVisibility(View.INVISIBLE);
                        b[17].setVisibility(View.INVISIBLE);
                        b[18].setVisibility(View.INVISIBLE);
                        b[19].setVisibility(View.INVISIBLE);
                        b[20].setVisibility(View.INVISIBLE);
                        b[21].setVisibility(View.INVISIBLE);
                        b[22].setVisibility(View.INVISIBLE);
                        b[23].setVisibility(View.INVISIBLE);
                        b[24].setVisibility(View.INVISIBLE);
                        break;

                    case 7:
                        b[0].setVisibility(View.INVISIBLE);
                        b[1].setVisibility(View.INVISIBLE);
                        b[2].setVisibility(View.INVISIBLE);
                        b[3].setVisibility(View.INVISIBLE);
                        b[4].setVisibility(View.INVISIBLE);
                        b[5].setVisibility(View.INVISIBLE);
                        b[6].setVisibility(View.INVISIBLE);
                        b[7].setVisibility(View.VISIBLE);
                        b[8].setVisibility(View.INVISIBLE);
                        b[9].setVisibility(View.INVISIBLE);
                        b[10].setVisibility(View.INVISIBLE);
                        b[11].setVisibility(View.INVISIBLE);
                        b[12].setVisibility(View.INVISIBLE);
                        b[13].setVisibility(View.INVISIBLE);
                        b[14].setVisibility(View.INVISIBLE);
                        b[15].setVisibility(View.INVISIBLE);
                        b[16].setVisibility(View.INVISIBLE);
                        b[17].setVisibility(View.INVISIBLE);
                        b[18].setVisibility(View.INVISIBLE);
                        b[19].setVisibility(View.INVISIBLE);
                        b[20].setVisibility(View.INVISIBLE);
                        b[21].setVisibility(View.INVISIBLE);
                        b[22].setVisibility(View.INVISIBLE);
                        b[23].setVisibility(View.INVISIBLE);
                        b[24].setVisibility(View.INVISIBLE);
                        break;

                    case 8:
                    b[8].setVisibility(View.VISIBLE);
                    b[2].setVisibility(View.INVISIBLE);
                    b[1].setVisibility(View.INVISIBLE);
                    b[3].setVisibility(View.INVISIBLE);
                    b[4].setVisibility(View.INVISIBLE);


                    b[5].setVisibility(View.INVISIBLE);
                    b[6].setVisibility(View.INVISIBLE);
                    b[7].setVisibility(View.INVISIBLE);
                    b[0].setVisibility(View.INVISIBLE);
                    b[9].setVisibility(View.INVISIBLE);
                    b[10].setVisibility(View.INVISIBLE);
                    b[11].setVisibility(View.INVISIBLE);
                    b[12].setVisibility(View.INVISIBLE);
                    b[13].setVisibility(View.INVISIBLE);
                    b[14].setVisibility(View.INVISIBLE);
                    b[15].setVisibility(View.INVISIBLE);
                    b[16].setVisibility(View.INVISIBLE);
                    b[17].setVisibility(View.INVISIBLE);
                    b[18].setVisibility(View.INVISIBLE);
                    b[19].setVisibility(View.INVISIBLE);
                    b[20].setVisibility(View.INVISIBLE);
                    b[21].setVisibility(View.INVISIBLE);
                    b[22].setVisibility(View.INVISIBLE);
                    b[23].setVisibility(View.INVISIBLE);
                    b[24].setVisibility(View.INVISIBLE);
                    break;
                    case 9:
                        b[9].setVisibility(View.VISIBLE);
                        b[2].setVisibility(View.INVISIBLE);
                        b[1].setVisibility(View.INVISIBLE);
                        b[3].setVisibility(View.INVISIBLE);
                        b[4].setVisibility(View.INVISIBLE);


                        b[5].setVisibility(View.INVISIBLE);
                        b[6].setVisibility(View.INVISIBLE);
                        b[7].setVisibility(View.INVISIBLE);
                        b[8].setVisibility(View.INVISIBLE);
                        b[0].setVisibility(View.INVISIBLE);
                        b[10].setVisibility(View.INVISIBLE);
                        b[11].setVisibility(View.INVISIBLE);
                        b[12].setVisibility(View.INVISIBLE);
                        b[13].setVisibility(View.INVISIBLE);
                        b[14].setVisibility(View.INVISIBLE);
                        b[15].setVisibility(View.INVISIBLE);
                        b[16].setVisibility(View.INVISIBLE);
                        b[17].setVisibility(View.INVISIBLE);
                        b[18].setVisibility(View.INVISIBLE);
                        b[19].setVisibility(View.INVISIBLE);
                        b[20].setVisibility(View.INVISIBLE);
                        b[21].setVisibility(View.INVISIBLE);
                        b[22].setVisibility(View.INVISIBLE);
                        b[23].setVisibility(View.INVISIBLE);
                        b[24].setVisibility(View.INVISIBLE);
                        break;

                    case 10:
                        b[0].setVisibility(View.INVISIBLE);
                        b[1].setVisibility(View.INVISIBLE);
                        b[2].setVisibility(View.INVISIBLE);
                        b[3].setVisibility(View.INVISIBLE);
                        b[4].setVisibility(View.INVISIBLE);
                        b[5].setVisibility(View.INVISIBLE);
                        b[6].setVisibility(View.INVISIBLE);
                        b[7].setVisibility(View.INVISIBLE);
                        b[8].setVisibility(View.INVISIBLE);
                        b[9].setVisibility(View.INVISIBLE);
                        b[10].setVisibility(View.VISIBLE);
                        b[11].setVisibility(View.INVISIBLE);
                        b[12].setVisibility(View.INVISIBLE);
                        b[13].setVisibility(View.INVISIBLE);
                        b[14].setVisibility(View.INVISIBLE);
                        b[15].setVisibility(View.INVISIBLE);
                        b[16].setVisibility(View.INVISIBLE);
                        b[17].setVisibility(View.INVISIBLE);
                        b[18].setVisibility(View.INVISIBLE);
                        b[19].setVisibility(View.INVISIBLE);
                        b[20].setVisibility(View.INVISIBLE);
                        b[21].setVisibility(View.INVISIBLE);
                        b[22].setVisibility(View.INVISIBLE);
                        b[23].setVisibility(View.INVISIBLE);
                        b[24].setVisibility(View.INVISIBLE);
                        break;
                    case 11:
                        b[0].setVisibility(View.INVISIBLE);
                        b[1].setVisibility(View.INVISIBLE);
                        b[2].setVisibility(View.INVISIBLE);
                        b[3].setVisibility(View.INVISIBLE);
                        b[4].setVisibility(View.INVISIBLE);
                        b[5].setVisibility(View.INVISIBLE);
                        b[6].setVisibility(View.INVISIBLE);
                        b[7].setVisibility(View.INVISIBLE);
                        b[8].setVisibility(View.INVISIBLE);
                        b[9].setVisibility(View.INVISIBLE);
                        b[10].setVisibility(View.INVISIBLE);
                        b[11].setVisibility(View.VISIBLE);
                        b[12].setVisibility(View.INVISIBLE);
                        b[13].setVisibility(View.INVISIBLE);
                        b[14].setVisibility(View.INVISIBLE);
                        b[15].setVisibility(View.INVISIBLE);
                        b[16].setVisibility(View.INVISIBLE);
                        b[17].setVisibility(View.INVISIBLE);
                        b[18].setVisibility(View.INVISIBLE);
                        b[19].setVisibility(View.INVISIBLE);
                        b[20].setVisibility(View.INVISIBLE);
                        b[21].setVisibility(View.INVISIBLE);
                        b[22].setVisibility(View.INVISIBLE);
                        b[23].setVisibility(View.INVISIBLE);
                        b[24].setVisibility(View.INVISIBLE);
                        break;
                    case 12:

                        b[0].setVisibility(View.INVISIBLE);
                        b[1].setVisibility(View.INVISIBLE);
                        b[2].setVisibility(View.INVISIBLE);
                        b[3].setVisibility(View.INVISIBLE);
                        b[4].setVisibility(View.INVISIBLE);
                        b[5].setVisibility(View.INVISIBLE);
                        b[6].setVisibility(View.INVISIBLE);
                        b[7].setVisibility(View.INVISIBLE);
                        b[8].setVisibility(View.INVISIBLE);
                        b[9].setVisibility(View.INVISIBLE);
                        b[10].setVisibility(View.INVISIBLE);
                        b[11].setVisibility(View.INVISIBLE);
                        b[12].setVisibility(View.VISIBLE);
                        b[13].setVisibility(View.INVISIBLE);
                        b[14].setVisibility(View.INVISIBLE);
                        b[15].setVisibility(View.INVISIBLE);
                        b[16].setVisibility(View.INVISIBLE);
                        b[17].setVisibility(View.INVISIBLE);
                        b[18].setVisibility(View.INVISIBLE);
                        b[19].setVisibility(View.INVISIBLE);
                        b[20].setVisibility(View.INVISIBLE);
                        b[21].setVisibility(View.INVISIBLE);
                        b[22].setVisibility(View.INVISIBLE);
                        b[23].setVisibility(View.INVISIBLE);
                        b[24].setVisibility(View.INVISIBLE);
                        break;
                    case 13:
                        b[0].setVisibility(View.INVISIBLE);
                        b[1].setVisibility(View.INVISIBLE);
                        b[2].setVisibility(View.INVISIBLE);
                        b[3].setVisibility(View.INVISIBLE);
                        b[4].setVisibility(View.INVISIBLE);
                        b[5].setVisibility(View.INVISIBLE);
                        b[6].setVisibility(View.INVISIBLE);
                        b[7].setVisibility(View.INVISIBLE);
                        b[8].setVisibility(View.INVISIBLE);
                        b[9].setVisibility(View.INVISIBLE);
                        b[10].setVisibility(View.INVISIBLE);
                        b[11].setVisibility(View.INVISIBLE);
                        b[12].setVisibility(View.INVISIBLE);
                        b[13].setVisibility(View.VISIBLE);
                        b[14].setVisibility(View.INVISIBLE);
                        b[15].setVisibility(View.INVISIBLE);
                        b[16].setVisibility(View.INVISIBLE);
                        b[17].setVisibility(View.INVISIBLE);
                        b[18].setVisibility(View.INVISIBLE);
                        b[19].setVisibility(View.INVISIBLE);
                        b[20].setVisibility(View.INVISIBLE);
                        b[21].setVisibility(View.INVISIBLE);
                        b[22].setVisibility(View.INVISIBLE);
                        b[23].setVisibility(View.INVISIBLE);
                        b[24].setVisibility(View.INVISIBLE);
                        break;
                    case 14:
                        b[0].setVisibility(View.INVISIBLE);
                        b[1].setVisibility(View.INVISIBLE);
                        b[2].setVisibility(View.INVISIBLE);
                        b[3].setVisibility(View.INVISIBLE);
                        b[4].setVisibility(View.INVISIBLE);
                        b[5].setVisibility(View.INVISIBLE);
                        b[6].setVisibility(View.INVISIBLE);
                        b[7].setVisibility(View.INVISIBLE);
                        b[8].setVisibility(View.INVISIBLE);
                        b[9].setVisibility(View.INVISIBLE);
                        b[10].setVisibility(View.INVISIBLE);
                        b[11].setVisibility(View.INVISIBLE);
                        b[12].setVisibility(View.INVISIBLE);
                        b[13].setVisibility(View.INVISIBLE);
                        b[14].setVisibility(View.VISIBLE);
                        b[15].setVisibility(View.INVISIBLE);
                        b[16].setVisibility(View.INVISIBLE);
                        b[17].setVisibility(View.INVISIBLE);
                        b[18].setVisibility(View.INVISIBLE);
                        b[19].setVisibility(View.INVISIBLE);
                        b[20].setVisibility(View.INVISIBLE);
                        b[21].setVisibility(View.INVISIBLE);
                        b[22].setVisibility(View.INVISIBLE);
                        b[23].setVisibility(View.INVISIBLE);
                        b[24].setVisibility(View.INVISIBLE);
                        break;
                    case 15:
                        b[15].setVisibility(View.VISIBLE);
                        b[2].setVisibility(View.INVISIBLE);
                        b[1].setVisibility(View.INVISIBLE);
                        b[3].setVisibility(View.INVISIBLE);
                        b[4].setVisibility(View.INVISIBLE);


                        b[5].setVisibility(View.INVISIBLE);
                        b[6].setVisibility(View.INVISIBLE);
                        b[7].setVisibility(View.INVISIBLE);
                        b[8].setVisibility(View.INVISIBLE);
                        b[9].setVisibility(View.INVISIBLE);
                        b[10].setVisibility(View.INVISIBLE);
                        b[11].setVisibility(View.INVISIBLE);
                        b[12].setVisibility(View.INVISIBLE);
                        b[13].setVisibility(View.INVISIBLE);
                        b[14].setVisibility(View.INVISIBLE);
                        b[0].setVisibility(View.INVISIBLE);
                        b[16].setVisibility(View.INVISIBLE);
                        b[17].setVisibility(View.INVISIBLE);
                        b[18].setVisibility(View.INVISIBLE);
                        b[19].setVisibility(View.INVISIBLE);
                        b[20].setVisibility(View.INVISIBLE);
                        b[21].setVisibility(View.INVISIBLE);
                        b[22].setVisibility(View.INVISIBLE);
                        b[23].setVisibility(View.INVISIBLE);
                        b[24].setVisibility(View.INVISIBLE);
                        break;
                    case 16:
                        b[16].setVisibility(View.VISIBLE);
                        b[2].setVisibility(View.INVISIBLE);
                        b[1].setVisibility(View.INVISIBLE);
                        b[3].setVisibility(View.INVISIBLE);
                        b[4].setVisibility(View.INVISIBLE);


                        b[5].setVisibility(View.INVISIBLE);
                        b[6].setVisibility(View.INVISIBLE);
                        b[7].setVisibility(View.INVISIBLE);
                        b[8].setVisibility(View.INVISIBLE);
                        b[9].setVisibility(View.INVISIBLE);
                        b[10].setVisibility(View.INVISIBLE);
                        b[11].setVisibility(View.INVISIBLE);
                        b[12].setVisibility(View.INVISIBLE);
                        b[13].setVisibility(View.INVISIBLE);
                        b[14].setVisibility(View.INVISIBLE);
                        b[15].setVisibility(View.INVISIBLE);
                        b[0].setVisibility(View.INVISIBLE);
                        b[17].setVisibility(View.INVISIBLE);
                        b[18].setVisibility(View.INVISIBLE);
                        b[19].setVisibility(View.INVISIBLE);
                        b[20].setVisibility(View.INVISIBLE);
                        b[21].setVisibility(View.INVISIBLE);
                        b[22].setVisibility(View.INVISIBLE);
                        b[23].setVisibility(View.INVISIBLE);
                        b[24].setVisibility(View.INVISIBLE);
                        break;

                    case 17:

                        b[0].setVisibility(View.INVISIBLE);
                        b[1].setVisibility(View.INVISIBLE);
                        b[2].setVisibility(View.INVISIBLE);
                        b[3].setVisibility(View.INVISIBLE);
                        b[4].setVisibility(View.INVISIBLE);
                        b[5].setVisibility(View.INVISIBLE);
                        b[6].setVisibility(View.INVISIBLE);
                        b[7].setVisibility(View.INVISIBLE);
                        b[8].setVisibility(View.INVISIBLE);
                        b[9].setVisibility(View.INVISIBLE);
                        b[10].setVisibility(View.INVISIBLE);
                        b[11].setVisibility(View.INVISIBLE);
                        b[12].setVisibility(View.INVISIBLE);
                        b[13].setVisibility(View.INVISIBLE);
                        b[14].setVisibility(View.INVISIBLE);
                        b[15].setVisibility(View.INVISIBLE);
                        b[16].setVisibility(View.INVISIBLE);
                        b[17].setVisibility(View.VISIBLE);
                        b[18].setVisibility(View.INVISIBLE);
                        b[19].setVisibility(View.INVISIBLE);
                        b[20].setVisibility(View.INVISIBLE);
                        b[21].setVisibility(View.INVISIBLE);
                        b[22].setVisibility(View.INVISIBLE);
                        b[23].setVisibility(View.INVISIBLE);
                        b[24].setVisibility(View.INVISIBLE);
                        break;

                    case 18:
                        b[18].setVisibility(View.VISIBLE);
                        b[2].setVisibility(View.INVISIBLE);
                        b[1].setVisibility(View.INVISIBLE);
                        b[3].setVisibility(View.INVISIBLE);
                        b[4].setVisibility(View.INVISIBLE);


                        b[5].setVisibility(View.INVISIBLE);
                        b[6].setVisibility(View.INVISIBLE);
                        b[7].setVisibility(View.INVISIBLE);
                        b[8].setVisibility(View.INVISIBLE);
                        b[9].setVisibility(View.INVISIBLE);
                        b[10].setVisibility(View.INVISIBLE);
                        b[11].setVisibility(View.INVISIBLE);
                        b[12].setVisibility(View.INVISIBLE);
                        b[13].setVisibility(View.INVISIBLE);
                        b[14].setVisibility(View.INVISIBLE);
                        b[15].setVisibility(View.INVISIBLE);
                        b[16].setVisibility(View.INVISIBLE);
                        b[17].setVisibility(View.INVISIBLE);
                        b[0].setVisibility(View.INVISIBLE);
                        b[19].setVisibility(View.INVISIBLE);
                        b[20].setVisibility(View.INVISIBLE);
                        b[21].setVisibility(View.INVISIBLE);
                        b[22].setVisibility(View.INVISIBLE);
                        b[23].setVisibility(View.INVISIBLE);
                        b[24].setVisibility(View.INVISIBLE);
                        break;

                    case 19:
                    b[19].setVisibility(View.VISIBLE);
                    b[2].setVisibility(View.INVISIBLE);
                    b[1].setVisibility(View.INVISIBLE);
                    b[3].setVisibility(View.INVISIBLE);
                    b[4].setVisibility(View.INVISIBLE);


                    b[5].setVisibility(View.INVISIBLE);
                    b[6].setVisibility(View.INVISIBLE);
                    b[7].setVisibility(View.INVISIBLE);
                    b[8].setVisibility(View.INVISIBLE);
                    b[9].setVisibility(View.INVISIBLE);
                    b[10].setVisibility(View.INVISIBLE);
                    b[11].setVisibility(View.INVISIBLE);
                    b[12].setVisibility(View.INVISIBLE);
                    b[13].setVisibility(View.INVISIBLE);
                    b[14].setVisibility(View.INVISIBLE);
                    b[15].setVisibility(View.INVISIBLE);
                    b[16].setVisibility(View.INVISIBLE);
                    b[17].setVisibility(View.INVISIBLE);
                    b[18].setVisibility(View.INVISIBLE);
                    b[0].setVisibility(View.INVISIBLE);
                    b[20].setVisibility(View.INVISIBLE);
                    b[21].setVisibility(View.INVISIBLE);
                    b[22].setVisibility(View.INVISIBLE);
                    b[23].setVisibility(View.INVISIBLE);
                    b[24].setVisibility(View.INVISIBLE);
                    break;

                    case 20:
                        b[20].setVisibility(View.VISIBLE);
                        b[2].setVisibility(View.INVISIBLE);
                        b[1].setVisibility(View.INVISIBLE);
                        b[3].setVisibility(View.INVISIBLE);
                        b[4].setVisibility(View.INVISIBLE);


                        b[5].setVisibility(View.INVISIBLE);
                        b[6].setVisibility(View.INVISIBLE);
                        b[7].setVisibility(View.INVISIBLE);
                        b[8].setVisibility(View.INVISIBLE);
                        b[9].setVisibility(View.INVISIBLE);
                        b[10].setVisibility(View.INVISIBLE);
                        b[11].setVisibility(View.INVISIBLE);
                        b[12].setVisibility(View.INVISIBLE);
                        b[13].setVisibility(View.INVISIBLE);
                        b[14].setVisibility(View.INVISIBLE);
                        b[15].setVisibility(View.INVISIBLE);
                        b[16].setVisibility(View.INVISIBLE);
                        b[17].setVisibility(View.INVISIBLE);
                        b[18].setVisibility(View.INVISIBLE);
                        b[19].setVisibility(View.INVISIBLE);
                        b[0].setVisibility(View.INVISIBLE);
                        b[21].setVisibility(View.INVISIBLE);
                        b[22].setVisibility(View.INVISIBLE);
                        b[23].setVisibility(View.INVISIBLE);
                        b[24].setVisibility(View.INVISIBLE);
                        break;

                    case 21:
                        b[21].setVisibility(View.VISIBLE);
                        b[2].setVisibility(View.INVISIBLE);
                        b[1].setVisibility(View.INVISIBLE);
                        b[3].setVisibility(View.INVISIBLE);
                        b[4].setVisibility(View.INVISIBLE);


                        b[5].setVisibility(View.INVISIBLE);
                        b[6].setVisibility(View.INVISIBLE);
                        b[7].setVisibility(View.INVISIBLE);
                        b[8].setVisibility(View.INVISIBLE);
                        b[9].setVisibility(View.INVISIBLE);
                        b[10].setVisibility(View.INVISIBLE);
                        b[11].setVisibility(View.INVISIBLE);
                        b[12].setVisibility(View.INVISIBLE);
                        b[13].setVisibility(View.INVISIBLE);
                        b[14].setVisibility(View.INVISIBLE);
                        b[15].setVisibility(View.INVISIBLE);
                        b[16].setVisibility(View.INVISIBLE);
                        b[17].setVisibility(View.INVISIBLE);
                        b[18].setVisibility(View.INVISIBLE);
                        b[19].setVisibility(View.INVISIBLE);
                        b[20].setVisibility(View.INVISIBLE);
                        b[0].setVisibility(View.INVISIBLE);
                        b[22].setVisibility(View.INVISIBLE);
                        b[23].setVisibility(View.INVISIBLE);
                        b[24].setVisibility(View.INVISIBLE);
                        break;
                    case 22:

                        b[0].setVisibility(View.INVISIBLE);
                        b[1].setVisibility(View.INVISIBLE);
                        b[2].setVisibility(View.INVISIBLE);
                        b[3].setVisibility(View.INVISIBLE);
                        b[4].setVisibility(View.INVISIBLE);
                        b[5].setVisibility(View.INVISIBLE);
                        b[6].setVisibility(View.INVISIBLE);
                        b[7].setVisibility(View.INVISIBLE);
                        b[8].setVisibility(View.INVISIBLE);
                        b[9].setVisibility(View.INVISIBLE);
                        b[10].setVisibility(View.INVISIBLE);
                        b[11].setVisibility(View.INVISIBLE);
                        b[12].setVisibility(View.INVISIBLE);
                        b[13].setVisibility(View.INVISIBLE);
                        b[14].setVisibility(View.INVISIBLE);
                        b[15].setVisibility(View.INVISIBLE);
                        b[16].setVisibility(View.INVISIBLE);
                        b[17].setVisibility(View.INVISIBLE);
                        b[18].setVisibility(View.INVISIBLE);
                        b[19].setVisibility(View.INVISIBLE);
                        b[20].setVisibility(View.INVISIBLE);
                        b[21].setVisibility(View.INVISIBLE);
                        b[22].setVisibility(View.VISIBLE);
                        b[23].setVisibility(View.INVISIBLE);
                        b[24].setVisibility(View.INVISIBLE);
                        break;
                    case 23:
                        b[23].setVisibility(View.VISIBLE);
                        b[2].setVisibility(View.INVISIBLE);
                        b[1].setVisibility(View.INVISIBLE);
                        b[3].setVisibility(View.INVISIBLE);
                        b[4].setVisibility(View.INVISIBLE);


                        b[5].setVisibility(View.INVISIBLE);
                        b[6].setVisibility(View.INVISIBLE);
                        b[7].setVisibility(View.INVISIBLE);
                        b[8].setVisibility(View.INVISIBLE);
                        b[9].setVisibility(View.INVISIBLE);
                        b[10].setVisibility(View.INVISIBLE);
                        b[11].setVisibility(View.INVISIBLE);
                        b[12].setVisibility(View.INVISIBLE);
                        b[13].setVisibility(View.INVISIBLE);
                        b[14].setVisibility(View.INVISIBLE);
                        b[15].setVisibility(View.INVISIBLE);
                        b[16].setVisibility(View.INVISIBLE);
                        b[17].setVisibility(View.INVISIBLE);
                        b[18].setVisibility(View.INVISIBLE);
                        b[19].setVisibility(View.INVISIBLE);
                        b[20].setVisibility(View.INVISIBLE);
                        b[21].setVisibility(View.INVISIBLE);
                        b[22].setVisibility(View.INVISIBLE);
                        b[0].setVisibility(View.INVISIBLE);
                        b[24].setVisibility(View.INVISIBLE);
                        break;

                    case 24:
                        b[24].setVisibility(View.VISIBLE);
                        b[2].setVisibility(View.INVISIBLE);
                        b[1].setVisibility(View.INVISIBLE);
                        b[3].setVisibility(View.INVISIBLE);
                        b[4].setVisibility(View.INVISIBLE);


                        b[5].setVisibility(View.INVISIBLE);
                        b[6].setVisibility(View.INVISIBLE);
                        b[7].setVisibility(View.INVISIBLE);
                        b[8].setVisibility(View.INVISIBLE);
                        b[9].setVisibility(View.INVISIBLE);
                        b[10].setVisibility(View.INVISIBLE);
                        b[11].setVisibility(View.INVISIBLE);
                        b[12].setVisibility(View.INVISIBLE);
                        b[13].setVisibility(View.INVISIBLE);
                        b[14].setVisibility(View.INVISIBLE);
                        b[15].setVisibility(View.INVISIBLE);
                        b[16].setVisibility(View.INVISIBLE);
                        b[17].setVisibility(View.INVISIBLE);
                        b[18].setVisibility(View.INVISIBLE);
                        b[19].setVisibility(View.INVISIBLE);
                        b[20].setVisibility(View.INVISIBLE);
                        b[21].setVisibility(View.INVISIBLE);
                        b[22].setVisibility(View.INVISIBLE);
                        b[0].setVisibility(View.INVISIBLE);
                        b[23].setVisibility(View.INVISIBLE);
                        break;

                }
            }
        };
    };


    public class MyRunnable implements Runnable
    {
        @Override
        public void run()
        {
            while(i>0)
            {

                number = rnd.nextInt(24);

                i--;
                i--;
                i--;
                if(i<0){

                    Intent intent = new Intent(gameMain_LevelThree.this,RankRegister.class);
                    intent.putExtra("score",score);
                    startActivity(intent);
                }

                Message msg = Message.obtain();
                msg.what = 0;
                mainHandler.sendMessage(msg);
                try
                {
                    Thread.sleep(300);
                }
                catch (Exception e)
                {
                }
            }
        }
    }


}


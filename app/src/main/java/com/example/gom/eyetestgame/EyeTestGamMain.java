package com.example.gom.eyetestgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;


public class EyeTestGamMain extends AppCompatActivity {
    private Socket socket;
    BufferedReader socket_in;
    PrintWriter socket_out;
    EditText input;
    Button button;
    TextView output;
    String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eye_test_gam_main);
        input = (EditText) findViewById(R.id.input);
        button = (Button) findViewById(R.id.button);
        output = (TextView) findViewById(R.id.output);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = input.getText().toString();
                Log.w("NETWORK",""+data);
                if(data != null)
                    socket_out.println(data);
            }
        });

        Thread worker = new Thread() {
            public void run() {
                try{
                    socket = new Socket("172.20.2.83",6666);
                    socket_out = new PrintWriter(socket.getOutputStream(),true);
                    socket_in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                }catch (IOException e){
                    e.printStackTrace();
                }
                try
                {
                    while (true){
                        data = socket_in.readLine();
                        output.post(new Runnable() {
                            @Override
                            public void run() {
                                output.setText(data);
                            }
                        });
                    }
                }catch (Exception e){

                }
            }
        };
        worker.start();
    }

    @Override
    protected void onStop(){
        super.onStop();
        try{
            socket.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

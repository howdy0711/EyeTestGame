package com.example.gom.eyetestgame;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ranklistView extends Activity {

    ListView list;
    ListViewAdapter adapter;

    SQLiteDatabase db;
    RankDBHelper helper;
    ArrayList<Rank> ranklist = new ArrayList<Rank>();
    private String init,comment;
    private int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ranklist_view);
        helper = new RankDBHelper(this,"rank.db",null,1);


        Intent intent = getIntent();
        init = intent.getStringExtra("init");
        comment = intent.getStringExtra("comment");
        score = intent.getIntExtra("score",1);

        insert(init,comment,score);

        select();

        list = (ListView)findViewById(R.id.listView);
        adapter =new ListViewAdapter(this,ranklist);

        list.setAdapter(adapter);

    }

    public void insert(String id, String comment, int score){
        db= helper.getWritableDatabase();
        Cursor cursor = db.rawQuery("select * from rank where id='"+id+"' ",null);

        String date = DateFormat.getDateTimeInstance().format(new Date());

        if(cursor.getCount() == 0){
            ContentValues values = new ContentValues();
            values.put("date",date);
            values.put("id",id);
            values.put("comment",comment);
            values.put("score",score);
            db.insert("rank",null,values);
        }

        else{
            Toast.makeText(getApplicationContext(), "등록된 이니셜입니다.", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(ranklistView.this,RankRegister.class);
            startActivity(intent);
        }

    }

    public void select(){
        db = helper.getWritableDatabase();
        int num =0;
        Cursor c = db.query("rank",null,null,null,null,null,"score desc",null);

        while(c.moveToNext()){
            String date= c.getString(c.getColumnIndex("date"));
            String id = c.getString(c.getColumnIndex("id"));
            String comment = c.getString(c.getColumnIndex("comment"));
            int score = c.getInt(c.getColumnIndex("score"));
            num++;
            Rank rank = new Rank(num,date+" ","INITIAL: "+id,comment," SCORE: "+score);
            ranklist.add(rank);
            Log.i("db",date+"\n"
            +id+"\n"+"score"+"\n");
        }
    }
}

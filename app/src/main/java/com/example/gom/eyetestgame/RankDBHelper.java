package com.example.gom.eyetestgame;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by gom on 2016-11-28.
 */
public class RankDBHelper extends SQLiteOpenHelper{

    public RankDBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version){
        super(context,name,factory,version);
    }
    @Override
    public void onCreate(SQLiteDatabase db){
        String sql = "CREATE TABLE rank("+
                "num integer primary key autoincrement," +
                "date text,"+
                "id text," +
                "comment text,"+
                "score integer);";

        Log.i("성공","성공");
        db.execSQL(sql);
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        String sql= "drop table if exites rank";
        db.execSQL(sql);
        onCreate(db);
    }
}

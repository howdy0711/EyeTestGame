package com.example.gom.eyetestgame;

/**
 * Created by gom on 2016-11-28.
 */
public class Rank
{

        int num;
        String date;
        String id;
        String comment;
        String score;

        public Rank(int num, String date, String id, String comment, String score ){
            this.num = num;
            this.date = date;
            this.id = id;
            this.comment = comment;
            this.score = score;
        }

        public int getnum() {return this.num;}
        public String getcomment(){ return this.comment;}
        public String getdate() {return this.date;}
        public String getid() {return this.id;}
        public String getscore() {return this.score;}

}

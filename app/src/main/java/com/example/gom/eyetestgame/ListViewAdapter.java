package com.example.gom.eyetestgame;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Created by gom on 2016-11-28.
 */
    public class ListViewAdapter extends BaseAdapter {

    // Declare Variables
    Context mContext;
    LayoutInflater inflater;
    private List<Rank> ranks = null;
    private ArrayList<Rank> arraylist;

    public ListViewAdapter(Context context, List<Rank> ranks) {
        mContext = context;
        this.ranks = ranks;
        inflater = LayoutInflater.from(mContext);
        this.arraylist = new ArrayList<Rank>();
        this.arraylist.addAll(ranks);
    }


    public class ViewHolder {
        TextView date;
        TextView id;
        TextView score;
        TextView num;

    }

    @Override
    public int getCount() {
        return ranks.size();
    }

    @Override
    public Rank getItem(int position) {
        return ranks.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public View getView(final int position, View view, ViewGroup parent) {
        final ViewHolder holder;
        if (view == null) {
            holder = new ViewHolder();
            view = inflater.inflate(R.layout.listview, null);
            // Locate the TextViews in listview_item.xml
            holder.date = (TextView) view.findViewById(R.id.date);
            holder.id = (TextView) view.findViewById(R.id.id);
            holder.score = (TextView) view.findViewById(R.id.score);
            holder.num = (TextView) view.findViewById(R.id.num);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        String str = ranks.get(position).getscore()+"";
        holder.num.setText(ranks.get(position).getnum()+"st ");
        holder.id.setText(ranks.get(position).getid());
        holder.score.setText(str);

        // Listen for ListView Item Click
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // Send single item click data to SingleItemView Class
                Intent intent = new Intent(mContext, SingleItemView.class);
                intent.putExtra("date",(ranks.get(position).getdate()));
                intent.putExtra("id",(ranks.get(position).getid()));
                intent.putExtra("comment",(ranks.get(position).getcomment()));
                intent.putExtra("score",(ranks.get(position).getscore()));
                // Pass all data flag
                // Start SingleItemView Class
                mContext.startActivity(intent);
            }
        });

        return view;
    }
        // Filter Class

    public void filter(String charText) {
        charText = charText.toLowerCase(Locale.getDefault());
        ranks.clear();
        if (charText.length() == 0) {
            ranks.addAll(arraylist);
        } else {
            for (Rank rk : arraylist) {
                if (rk.getdate().toLowerCase(Locale.getDefault()).contains(charText)) {
                    ranks.add(rk);
                }
            }
        }
        notifyDataSetChanged();
    }

}


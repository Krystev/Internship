package com.vratsasoftware.tito.ninegag;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Tito on 21.10.2015 г..
 */
public class ItemAdapter extends BaseAdapter {

    private ArrayList<Item> items;
    private Context context;

    public ItemAdapter(ArrayList<Item> items, Context context) {
        this.context = context;
        this.items = items;
    }


    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Item getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ViewHolder holder;
        if (convertView == null) {
            convertView = View.inflate(context, R.layout.activity_list_item, null);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        final Item item = getItem(position);

        holder.txtItemName.setText(item.getName());
        holder.imageView.setImageResource(item.getImage());
        holder.txtItemPoints.setText(item.getPoints() + " POINTS");
        holder.voteUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                item.setPoints(item.getPoints() + 1);
                holder.txtItemPoints.setText(item.getPoints() + " POINTS");
            }
        });
        holder.voteDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                item.setPoints(item.getPoints() - 1);
            holder.txtItemPoints.setText(item.getPoints() + " POINTS");
            }
        });

        return convertView;
    }

    static class ViewHolder {
        @Bind(R.id.txt_item_name)
        TextView txtItemName;
        @Bind(R.id.imageView)
        ImageView imageView;
        @Bind(R.id.txt_item_points)
        TextView txtItemPoints;
        @Bind(R.id.button)
        Button voteUp;
        @Bind(R.id.button2)
        Button voteDown;

        public ViewHolder(View convertView) {
            ButterKnife.bind(this, convertView);
        }
    }
}

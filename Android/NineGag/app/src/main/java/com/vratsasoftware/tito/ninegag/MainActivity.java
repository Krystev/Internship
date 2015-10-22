package com.vratsasoftware.tito.ninegag;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.list)
    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        ArrayList<Item> data = getItems();
        final ItemAdapter adapter = new ItemAdapter(data, this);

        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Item item = adapter.getItem(position);
                Intent i = new Intent(MainActivity.this, ItemDetailsActivity.class);
                i.putExtra("name", item.getName());
                i.putExtra("image", item.getImage());
                i.putExtra("points", item.getPoints());
                startActivity(i);
            }
        });
    }

    private ArrayList<Item> getItems() {
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("Liverpool Logo", 12, R.drawable.pic1));
        items.add(new Item("Liverpool Logo Red", 19, R.drawable.pic2));
        items.add(new Item("Liverpool Golden Logo", 39, R.drawable.pic3));
        items.add(new Item("Liverpool Champions", 119, R.drawable.pic4));
        return items;
    }

}


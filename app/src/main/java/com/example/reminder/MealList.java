package com.example.reminder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MealList extends AppCompatActivity {

    ListView list;
    String[] mobileArray = {"meal","meal","meal","meal",
            "Egg sandwich","meal","meal","meal", "meal","meal","meal","meal",
            "Egg sandwich","meal","meal","meal"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meal_list);

        list = findViewById(R.id.listView);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.item_list, mobileArray);

        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }
}
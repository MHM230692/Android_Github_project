package com.prototype.studentonlinequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class NewAdapter extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_adapter);
        listView = (ListView) findViewById(R.id.listView);
        String[] cars= {"Corolla","Vitz","Civic","Mustang"};


      ArrayAdapter<String> adapter = new ArrayAdapter<String>(NewAdapter.this,R.layout.list_sample,R.id.listTextView,cars);
      listView.setAdapter(adapter);



    }
}
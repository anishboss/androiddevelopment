package com.example.testhello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class dashboard extends AppCompatActivity {

    ListView lvInfoA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        final String[] students = {"Birat","Prajanya","Pratik","Hari","Ram","Sam","Kiran","Rabin","Sandip","Bijay","Bipin","Torpey","Goktey",
                        "Hero",
                "Sabin",
                "Birat","Prajanya","Pratik","Hari","Ram","Sam","Kiran","Rabin","Sandip","Bijay","Bipin","Torpey","Goktey",
                "Hero",
                "Sabin",
        };
        lvInfoA = (ListView) findViewById(R.id.lv_info_a);

        ArrayAdapter arrayAdapter = new ArrayAdapter(dashboard.this,android.R.layout.simple_list_item_1,students);
        lvInfoA.setAdapter(arrayAdapter);
        lvInfoA.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(dashboard.this, students[position], Toast.LENGTH_SHORT).show();
            }
        });

    }
}
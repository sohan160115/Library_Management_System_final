package com.example.user.library_management_system;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.content.Intent;

public class Faculty_List extends AppCompatActivity {
    private ListView listView;
    private ArrayAdapter<String> adapter;
    String[] Faculty_List;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty__list);
      listView = (ListView) findViewById(R.id.Listviewid);
        final String[] FacultyList= getResources().getStringArray(R.array.Faculty_List);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(Faculty_List.this,R.layout.sample_view,R.id.textViewId,FacultyList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(FacultyList[position]==FacultyList[0]) {

                    Intent intent = new Intent(getApplicationContext(), CSE_BOOK.class);
                    startActivity(intent);
                }
                
            }
        });


    }
}

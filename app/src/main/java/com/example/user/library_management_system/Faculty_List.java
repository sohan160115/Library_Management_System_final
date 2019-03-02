package com.example.user.library_management_system;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Faculty_List extends AppCompatActivity {
    private ListView listView;
    private ArrayAdapter<String> adapter;
    String[] Faculty_List;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty__list);
      listView = (ListView) findViewById(R.id.Listviewid);
        String[] FacultyList= getResources().getStringArray(R.array.Faculty_List);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(Faculty_List.this,R.layout.sample_view,R.id.textViewId,FacultyList);
        listView.setAdapter(adapter);
    }
}

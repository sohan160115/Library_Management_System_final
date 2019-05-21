package com.example.user.library_management_system;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
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
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty__list);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        ActionBar bar = getSupportActionBar();
        setSupportActionBar(toolbar);




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
                if(FacultyList[position]==FacultyList[1]) {

                    Intent intent = new Intent(getApplicationContext(), PME_BOOK.class);
                    startActivity(intent);
                }
                if(FacultyList[position]==FacultyList[2]) {

                    Intent intent = new Intent(getApplicationContext(), ChE_BOOK.class);
                    startActivity(intent);
                }
                if(FacultyList[position]==FacultyList[3]) {

                    Intent intent = new Intent(getApplicationContext(), EEE_BOOK.class);
                    startActivity(intent);
                }
                if(FacultyList[position]==FacultyList[4]) {

                    Intent intent = new Intent(getApplicationContext(), IPE_BOOK.class);
                    startActivity(intent);
                }
                if(FacultyList[position]==FacultyList[5]) {

                    Intent intent = new Intent(getApplicationContext(), BME_BOOK.class);
                    startActivity(intent);
                }
                if(FacultyList[position]==FacultyList[6]) {

                    Intent intent = new Intent(getApplicationContext(), TE_BOOK.class);
                    startActivity(intent);
                }

            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_tool_bar,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.user)
        {
            Intent intent = new Intent(getApplicationContext(), Login.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}

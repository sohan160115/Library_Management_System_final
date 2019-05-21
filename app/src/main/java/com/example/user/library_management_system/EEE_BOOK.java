package com.example.user.library_management_system;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.List;

public class EEE_BOOK extends AppCompatActivity {
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eee__book);
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        new FirebaseDatabaseHelper4().readBooks(new FirebaseDatabaseHelper4.DataStatus() {
            @Override
            public void DataIsLoaded(List<book> eeebook, List<String> keys) {
                new RecyclerView_config4().setConfig(mRecyclerView,EEE_BOOK.this,eeebook,keys);
            }

            @Override
            public void DataIsInserted() {

            }

            @Override
            public void DataIsDeleted() {

            }
        });
    }
}

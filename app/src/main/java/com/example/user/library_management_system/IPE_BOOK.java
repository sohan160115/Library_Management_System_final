package com.example.user.library_management_system;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.List;

public class IPE_BOOK extends AppCompatActivity {
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ipe__book);
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        new FirebaseDatabaseHelper5().readBooks(new FirebaseDatabaseHelper5.DataStatus() {
            @Override
            public void DataIsLoaded(List<book> ipebook, List<String> keys) {
                new RecyclerView_config4().setConfig(mRecyclerView,IPE_BOOK.this,ipebook,keys);
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


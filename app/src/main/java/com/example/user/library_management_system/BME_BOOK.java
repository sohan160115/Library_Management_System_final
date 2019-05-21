package com.example.user.library_management_system;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.List;

public class BME_BOOK extends AppCompatActivity {
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bme__book);
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        new FirebaseDatabaseHelper6().readBooks(new FirebaseDatabaseHelper6.DataStatus() {
            @Override
            public void DataIsLoaded(List<book> bme, List<String> keys) {
                new RecyclerView_config6().setConfig(mRecyclerView,BME_BOOK.this,bme,keys);
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


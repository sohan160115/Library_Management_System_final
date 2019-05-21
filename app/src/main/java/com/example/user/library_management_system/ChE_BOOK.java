package com.example.user.library_management_system;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.List;

public class ChE_BOOK extends AppCompatActivity {
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch_e__book);
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        new FirebaseDatabaseHelper3().readBooks(new FirebaseDatabaseHelper3.DataStatus() {
            @Override
            public void DataIsLoaded(List<book> cebook, List<String> keys) {
                new RecyclerView_config2().setConfig(mRecyclerView,ChE_BOOK.this,cebook,keys);
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

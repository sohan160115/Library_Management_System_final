package com.example.user.library_management_system;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import static com.example.user.library_management_system.FirebaseDatabaseHelper7.*;

public class TE_BOOK extends AppCompatActivity {

    private RecyclerView mRecyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_te__book);


    mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        new FirebaseDatabaseHelper7().readBooks(new FirebaseDatabaseHelper7.DataStatus() {
        @Override
        public void DataIsLoaded(List<book> tebook, List<String> keys) {
            new RecyclerView_config7().setConfig(mRecyclerView,TE_BOOK.this,tebook,keys);
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

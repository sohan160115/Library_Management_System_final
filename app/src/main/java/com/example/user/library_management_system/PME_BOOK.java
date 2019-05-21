package com.example.user.library_management_system;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.List;

public class PME_BOOK extends AppCompatActivity {
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pme__book);
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        new FirebaseDatabaseHelper2().readBooks(new FirebaseDatabaseHelper2.DataStatus() {
        @Override
        public void DataIsLoaded(List<book> pmebook, List<String> keys) {
            new RecyclerView_config2().setConfig(mRecyclerView,PME_BOOK.this,pmebook,keys);
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

package com.example.user.library_management_system;

import android.support.annotation.NonNull;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class FirebaseDatabaseHelper4 {
    private FirebaseDatabase mDatabase;
    private DatabaseReference mReferenceBooks;
    private List<book> books = new ArrayList<>();
    public interface DataStatus{
        void DataIsLoaded(List<book> books, List<String> keys);
        void DataIsInserted();
        void DataIsDeleted();

    }

    public FirebaseDatabaseHelper4() {
        mDatabase = FirebaseDatabase.getInstance();
        mReferenceBooks= mDatabase.getReference("eeebook");

    }
    public void readBooks( final FirebaseDatabaseHelper4.DataStatus dataStatus){
        mReferenceBooks.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                books.clear();
                List<String> keys= new ArrayList<>();
                for(DataSnapshot keyNode : dataSnapshot.getChildren()){
                    keys.add(keyNode.getKey());
                    book book =keyNode.getValue(book.class);
                    books.add(book);
                }

                dataStatus.DataIsLoaded(books,keys);


            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

    }
}

package com.example.user.library_management_system;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RecyclerView_config7 {
    private Context mContext;
    private RecyclerView_config7.BookAdapter mBooksApapter;
    public void setConfig(RecyclerView recyclerView, Context context, List<book> tebook, List<String> keys){
        mContext = context;
        mBooksApapter =new RecyclerView_config7.BookAdapter(tebook, keys);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(mBooksApapter);
    }
    class BookItemView extends RecyclerView.ViewHolder{
        private TextView mTitle;
        private TextView mAuthor;
       // private TextView mISBN;
        private TextView mCategory;
        private  TextView mAvailable;
        private String key;
        public BookItemView(ViewGroup parent){
            super(LayoutInflater.from(mContext).
                    inflate(R.layout.book_list_item,parent,false));
            mTitle = (TextView) itemView.findViewById(R.id.title_txtbook);
            mAuthor = (TextView) itemView.findViewById(R.id.author_txtbook);
            mCategory = (TextView) itemView.findViewById(R.id.category_txtbook);
            mAvailable = (TextView) itemView.findViewById(R.id.available_txtbook);
            //mISBN = (TextView) itemView.findViewById(R.id.isbn_txtbook);
        }
        public void  bind(book book,String key){
            mTitle.setText(book.getTitle());
            mAuthor.setText(book.getAuthor());
            mCategory.setText(book.getCategory_name());
            mAvailable.setText(book.getAvailable());
            //mISBN.setText(book.getIsbn());
            this.key=key;
        }


    }
    class BookAdapter extends RecyclerView.Adapter<BookItemView> {
        List<book> mBookList;
        List<String> mKeys;

        public BookAdapter(List<book> mBookList, List<String> mKeys) {
            this.mBookList = mBookList;
            this.mKeys = mKeys;
        }

        @NonNull
        @Override
        public BookItemView onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            return new BookItemView(viewGroup);
        }

        @Override
        public void onBindViewHolder(BookItemView bookItemView, int i) {
            bookItemView.bind(mBookList.get(i), mKeys.get(i));
        }

        @Override
        public int getItemCount() {
            return mBookList.size();
        }
    }
}

package com.example.user.library_management_system;

public class book2 {
    private String title;
    private String author;
    private String isbn;
    private String category_name;

    public book2() {
    }

    public book2(String title, String author, String isbn, String category_name) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.category_name = category_name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }
}

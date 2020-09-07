package com.gajava.staticclassattribute;

public class Book {
    private String title;
    String author;
    int pages;
    String language;
    private static int bookCount = 0;

    public Book(String title, String author, int pages, String language){
        this.setTitle(title);
        this.author = author;
        this.pages = pages;
        this.language = language;
        bookCount++;
        System.out.println(bookCount);
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public int getBookCount(){
        return bookCount;
    }



}

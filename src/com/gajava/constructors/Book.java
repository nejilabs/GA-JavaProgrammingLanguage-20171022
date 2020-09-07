package com.gajava.constructors;

public class Book {
    String title;
    String author;
    int pages;
    String language;

    public Book(String title, String author, int pages, String language){
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.language = language;

        sayWhatBook();
    }

    public void sayWhatBook(){
        System.out.println(this.title);
        System.out.println(this.author);
        System.out.println(this.pages);
        System.out.println(this.language);
        System.out.println("");
    }

}

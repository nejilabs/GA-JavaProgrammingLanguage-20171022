package com.gajava.staticclassattribute;

public class K_StaticClassAttribute_Main {
    public static void main(String[] args) {
        Book Book1 = new Book("Book1 Title", "Book1 Author", 200, "Book1 Language");
        Book Book2 = new Book("Book2 Title", "Book2 Author", 200, "Book2 Language");

        System.out.println(Book1.getTitle());
        Book1.setTitle("Hello");
        System.out.println(Book1.getTitle());

        System.out.println(Book1.getBookCount());
        System.out.println(Book2.getBookCount());
    }
}

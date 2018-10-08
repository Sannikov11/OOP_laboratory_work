package com.company;
import com.company.Book;
public class BookTest {

    public static void main(String[] args) {
        Book FirstBook = new Book("Den11ska","Knijka",1999,546);
        FirstBook.getInfo();
        Book SecondBook = new Book();
        SecondBook.setInfo();
        SecondBook.getInfo();


    }
}

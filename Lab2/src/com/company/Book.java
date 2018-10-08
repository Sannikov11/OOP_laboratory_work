package com.company;
import java.util.Scanner;

public class Book
{
    public String autor;
    public String BName;
    public int Date;
    public int NumPage;

    public Book(){}

    public Book(String a, String b, int d, int np)
    {
        autor = a;
        BName = b;
        Date = d;
        NumPage = np;
    }


    public void getInfo()
    {
        System.out.println("Autor: " + autor + "\nBook Name: " + BName + "\nDate of writing: " + Date);
    }

    public void setInfo()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Book name: ");
        BName = sc.nextLine();
        System.out.print("Enter Autor's Name: ");
        autor = sc.nextLine();
        System.out.print("Enter Date of writing: ");
        Date = sc.nextInt();
        System.out.print("Enter number of pages: ");
        NumPage = sc.nextInt();
    }

}
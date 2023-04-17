/*
3.  Book Inventory Management System
    You are required to write a Java program to implement a Book class that can be used to manage
    a book inventory system.

The Book class should have the following fields:
    a. title: A string field to store the title of the book.
    b. author: A string field to store the name of the author of the book.
    c. publisher: A string field to store the name of the publisher of the book.
    d. isbn: A string field to store the ISBN number of the book.
    e. year: An integer field to store the year in which the book was published.
    f. price: A double field to store the price of the book.
    g. quantity: An integer field to store the quantity of the book in the inventory.

The Book class should have following methods
    a. Constructors,
    b. Getter & setter methods
    c. Business Logic methods
        I.   increaseQuantity(int quantity ): A method to increase the quantity of  the book in the inventory 
             by the specified amount.
        II.  decreaseQuantity(int quantity): A method to decrease the quantity of  the book in the inventory 
             by the specified amount.
        III. getInventoryValue(): A method to calculate the total value of the    inventory of the book,
             which is the product of the price and the quantity of the book.
 */


import java.util.Scanner;
class BookInventory{
    String title;
    String author;
    String publisher;
    String isbn;
    int year;
    int price  ;
    int quantity;
    int books = 100;
   
    Scanner sc = new Scanner(System.in);
   

    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public String getAuthor(){
        return this.author;
    }
    public void setAuthor(String author){
        this.author = author;
    }

    public String getPublisher(){
        return this.publisher;
    }
    public void setPublisher(String publisher){
        this.publisher = publisher;
    }

    public String getIsbn(){
        return this.isbn;
    }
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }

    public int getYear(){
        return this.year;
    }
    public void setYear(int year){
        this.year = year;
    }

    void IncreaseQuantity(){
        System.out.println("Enter the quantity of books to be increased : ");
        int increase = sc.nextInt();
        System.out.println("Total number of books : "+(books+increase)); 
        System.out.println("Enter the  unit price of added books : ");
        int price = sc.nextInt();
        System.out.println("Total value of the inventory of the books : "+(books+increase)*price);     
    }

    void DecreaseQuantity(){
        System.out.println("Enter the quantity of books to be decreased");
        int decrease = sc.nextInt();
        System.out.println("Total number of books : "+(books-decrease)); 
        System.out.println("Enter the unit price of removed books : ");
        int price = sc.nextInt();
        System.out.println("Total value of the inventory of the books : "+(books-decrease)*price);      
    }


}
class Book{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        BookInventory book = new BookInventory();
        System.out.println("Enter title of the book : ");
        book.setTitle(sc.nextLine());
        System.out.println("Enter name of the author of the book : ");
        book.setAuthor(sc.nextLine());
        System.out.println("Enter the name of the publisher of the book : ");
        book.setPublisher(sc.nextLine());
        System.out.println("Enter the ISBN number of the book : ");
        book.setIsbn(sc.nextLine());
        System.out.println("Enter the year in which the book was published : ");
        book.setYear(sc.nextInt());

        String title = book.getTitle();
        String author = book.getAuthor();
        String publisher = book.getPublisher();
        String isbn = book.getIsbn();
        int year = book.getYear();

        System.out.println("Choice:");
        System.out.println("1. Increase quantity of books");
        System.out.println("2. Decrease quantity of books");

        int num = sc.nextInt();
        switch(num){
        case 1: book.IncreaseQuantity();
            break;
        case 2: book.DecreaseQuantity(); 
            break;
        }

    }
}
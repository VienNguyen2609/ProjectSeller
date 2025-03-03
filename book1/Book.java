/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book1;

import java.util.Objects;
import java.util.Scanner;

public abstract class Book {
    private int BookId  , quantily; 
    private String bookName ; 
    private double price ; 

    public Book(int BookId, int quantily, String bookName, double price) {
        this.BookId = BookId;
        this.quantily = quantily;
        this.bookName = bookName;
        this.price = price;
    }

    public Book() {   }

    public int getBookId() {
        return BookId;
    }

    public void setBookId(int BookId) {
        this.BookId = BookId;
    }

    public int getQuantily() {
        return quantily;
    }

    public void setQuantily(int quantily) {
        this.quantily = quantily;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book1{" + "BookId=" + BookId + ", quantily=" + quantily + ", bookName=" + bookName + ", price=" + price + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return BookId == book.BookId && quantily == book.quantily && Double.compare(price, book.price) == 0 && Objects.equals(bookName, book.bookName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(BookId, quantily, bookName, price);
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("---nhap thong tin sach----");
        System.out.println("nhap ten sach: ");
        bookName = sc.nextLine() ;
        System.out.println("nhap id sach: ");
        BookId = sc.nextInt();
        System.out.println("nhap so luong sach: ");
        quantily = sc.nextInt() ;
        System.out.println("nhap gia sach: ");
        price = sc.nextDouble();
    }
    public abstract double tax();
}

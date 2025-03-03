/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book1;

import java.util.Objects;
import java.util.Scanner;

public class ArtBook extends Book {
   private int numberPage ; 
   private String authorName ;

    public ArtBook(int numberPage, String authorName, int BookId, int quantily, String bookName, double price) {
        super(BookId, quantily, bookName, price);
        this.numberPage = numberPage;
        this.authorName = authorName;
    }

    public ArtBook() { }

    public int getNumberPage() {
        return numberPage;
    }

    public void setNumberPage(int numberPage) {
        this.numberPage = numberPage;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return super.toString() + "ArtBook{" + "numberPage=" + numberPage + ", authorName=" + authorName + '}';
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("nhap ten tac gia: ");
        authorName = sc.nextLine();
        System.out.println("nhap so trang sach: ");
        numberPage = sc.nextInt();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ArtBook artBook = (ArtBook) o;
        return numberPage == artBook.numberPage && Objects.equals(authorName, artBook.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberPage, authorName);
    }

    @Override
    public double tax(){
          int a = getQuantily();
          if( a >= 10 ){
              return 0.05 * getPrice() ;
          }        
          return 0 ;
         
    }

     
}

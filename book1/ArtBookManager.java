/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArtBookManager  implements  IArtBookManage {
    private ArrayList<ArtBook> l = new ArrayList<>();
    public ArtBookManager() {
    }   
    public void inds(){
        if( l == null){
            System.out.println("ds rong ");
            return;
        }
        int i = 1 ;
        for(ArtBook n : l ){
            System.out.println("sach thu "+i+ " :"+n.toString());
            i++;
        }
    }
    @Override
    public void addArtBook(ArtBook e) throws Exception {
        if( e == null ){
            throw new Exception("them khong hop le");
        }
        else{
            l.add(e);
            System.out.println("them thanh cong: "+e);
        }
    }
    @Override
    public void delArtBook(ArtBook e )throws Exception {
        if(l.remove(e)){
            System.out.println("xoa thanh cong "+e);
        }
        else{
            throw new Exception("xoa khong hop le");
        }
    }
    @Override
    public void searchArtBookByName(String name) throws Exception {
        int dem = 0;
        for(ArtBook n : l ){
            if(n.getBookName().equalsIgnoreCase(name)){
                System.out.println(n);
                dem++;
            }
        }
        if(dem ==0){
            System.out.println("k tim thay!!!");
        }
        else if(name == null ){
          throw new Exception("ten khong hop le ten ");
        }
    }
    
   @Override
    public double totalTaxs() throws Exception{
        double dem = 0 ; 
         for(ArtBook n : l ){
             dem += n.tax();
         }
         if( dem < 0 ){
             throw new Exception("tong tien khong hop le");
         }
         System.out.println("tinh tong tien hoo le");
         return dem ; 
    }
 

    @Override
   public void sortArtBook (){
       try{       
         Collections.sort(l, new Comparator<ArtBook>(){
             @Override
             public int compare(ArtBook a , ArtBook b ){
                 return a.getBookName().compareToIgnoreCase(b.getBookName());
             }
         });
       }catch(Exception e){
           System.out.println("loi: "+e.getMessage());
       }
   }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package book1;

/**
 *
 * @author VIEN
 */
public interface IArtBookManage {
    void addArtBook(ArtBook e) throws Exception ; 
    void delArtBook(ArtBook e )throws Exception ;
    void searchArtBookByName(String name) throws Exception ;
    double totalTaxs() throws Exception;
    void sortArtBook(); 
}

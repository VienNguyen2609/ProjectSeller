/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Production;

import java.util.Objects;
import java.util.Scanner;

public abstract class FootWear {
    private String  name; 
    private int quantity; 
    private double price ; 
    private String idProduct;
    public FootWear(){
    }
    public FootWear(String idProduct , String name, int quantity, double price) {
        this.idProduct= idProduct ;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; 
        if (o == null || getClass() != o.getClass()) return false;    
        FootWear fw = (FootWear) o;
        return idProduct == fw.idProduct && quantity == fw.quantity
            && Double.compare(price, fw.price) == 0
            && Objects.equals(name, fw.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(quantity,name,price);
    }
    public abstract double totalPrice();

    @Override
    public String toString() {
        return "FootWear{" + "name=" + name + ", quantity=" + quantity + ", price=" + price + ", id=" + idProduct + '}';
    }
   
}


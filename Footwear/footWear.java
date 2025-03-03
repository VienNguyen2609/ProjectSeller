package Footwear;
import java.util.Objects;
import java.util.Scanner;

public abstract class footWear {
    private String  name; 
    private int quantity; 
    private double price ; 
    public footWear(){
    }
    public footWear(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
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
    public String toString() {
        return "footWear{" + ", name=" + name + ", quantity=" + quantity + ", price=" + price + '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; 
        if (o == null || getClass() != o.getClass()) return false;    
        footWear fw = (footWear) o;
        return quantity == fw.quantity
            && Double.compare(price, fw.price) == 0
            && Objects.equals(name, fw.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(quantity,name,price);
    }
    public abstract double totalPrice();
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Product Information");
        System.out.print("Name Product: ");
        name = sc.nextLine();
        System.out.print("Price Product: ");
        price = sc.nextDouble(); 
        System.out.print("Quantity Product: ");
        quantity = sc.nextInt() ; 
    }
}

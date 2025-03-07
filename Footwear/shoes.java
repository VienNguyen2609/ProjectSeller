package Footwear;
import java.util.Objects;
import java.util.Scanner;
public class shoes extends footWear{
    private double size ; 
    private String color ; 

    public shoes(String name , double size , double price , int quantity , String color  ) {
        super( name , quantity , price);
        this.size = size;
        this.color = color;
    }
    public shoes(){}       

    private shoes(String name, double quantity, double price) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
     @Override
    public boolean equals(Object o) {
        if (this == o) return true; 
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
         shoes sh = (shoes) o; 
        return Double.compare(size, sh.size) == 0 && Objects.equals(color, sh.color);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), size, color);
    }
    @Override
    public String toString() {
        return super.toString()+" , shoes{" + "size=" + size + ", color=" + color + '}';
    }
    @Override
     public double totalPrice(){
        return getPrice() * getQuantity() ; 
     } 
    @Override
   public void input(){
       Scanner sc = new Scanner(System.in);
       super.input(); 
       System.out.print("Color: ");
       color = sc.nextLine();
       System.out.print("Size: ");
       size = sc.nextDouble() ; 
      
   }
  
}

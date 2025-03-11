package Production;
import java.util.Objects;

public class Shoes extends FootWear{
    private int size ; 
    private String color ; 
    
    public Shoes(String id , String name , int size , double price , int quantity , String color  ) {
        super( id , name , quantity , price);
        this.size = size;
        this.color = color;
    }
    public Shoes(){}       

    private Shoes(String name, double quantity, double price) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public double getSize() {
        return size;
    }

    public void setSize(int size) {
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
         Shoes sh = (Shoes) o; 
        return Double.compare(size, sh.size) == 0 && Objects.equals(color, sh.color);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), size, color);
    } 
    @Override
     public double totalPrice(){
        return getPrice() * getQuantity() ; 
     } 

    @Override
    public String toString() {
        return super.toString()+"Shoes{" + "size=" + size + ", color=" + color + '}';
    }
  
   
  
}

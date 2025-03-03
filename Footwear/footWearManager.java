package Footwear;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
public class footWearManager implements IfootWearmanager{
    private ArrayList<shoes> l = new ArrayList<>();
    private Set<footWear> footwearSet = new HashSet<>();
     private boolean isIdExists(String name) {
        for (footWear f : l ) {
            if (f.getName().equals(name)) {
                return true; 
            }
        }
        return false;
    } 
    public footWearManager(ArrayList<shoes> l){
        this.l = l;
    }
    public footWearManager(){}
    public void output(){
        if(l == null ){
            System.out.println("LIST IS EMPTY");
            return ;
        }
        else{
            int i = 1 ; 
            for(shoes n : l){
                System.out.println("PRODUCT "+i+": "+n.toString());
                i++ ;
            }
        }
    }
    @Override
    public  void addShoes(shoes e) throws Exception {
        if( isIdExists(e.getName())){
            throw new Exception("Invalid Additional Products: "+e);
        }
        else{
            l.add(e); 
            System.out.println("Addtional Successful: "+e);
        }
    }
    @Override
      public void delShoes(shoes e )throws Exception {
        if(l.remove(e)){
            System.out.println("Delete Successful"+e);
        }
        else{
            throw new Exception("Delete Failed "+e);
        }
      }
    
    @Override
   public void searchShoes(String name) throws Exception {
        int dem = 0;
        for(shoes n : l ){
            if(n.getName().equalsIgnoreCase(name)){
                System.out.println(n);
                dem++;
            }
        }
        if(dem ==0){
            System.out.println("Not Found!!!");
        }
        else if(name == null ){
          throw new Exception("Invalid Name");
        }
    }
    @Override
   public double totalTax(){
       double sum  = 0 ; 
       for(shoes n : l){
           sum += n.totalPrice();
       }
       return sum ;
   }
}

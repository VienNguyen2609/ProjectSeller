
package Footwear;
import java.util.Scanner;

public class Main {
     static footWearManager m = new footWearManager();
    public static void main(String[] args) {
        test();
    }
    public static void test(){
        Scanner sc = new Scanner(System.in); 
        do{
            System.out.println("1: ADD PD");
            System.out.println("2: DELETE PD");
            System.out.println("3: FIND PD");
            System.out.println("4: TOTAL PD");
            System.out.println("5: SHOW LIST ");
            System.out.println("6: EXITS");
            System.out.print("Your Choice: ");
            int n = sc.nextInt();
            switch(n){
                 case 1:
                    try{
                        System.out.println("New Product ");
                        shoes a = new shoes();
                        a.input();
                        System.out.println("Information: "+a);
                        m.addShoes(a);
                    }catch(Exception e ){
                        System.out.println("Error : "+e.getMessage());
                    }
                    break ;
                     case 2:
                    try{
                        System.out.println("Products Need To Remove");
                        shoes b = new shoes();
                        b.input();
                        m.delShoes(b);
                    }catch(Exception e ){
                        System.out.println("Error: "+e.getMessage());
                    }
                    break ;
                     case 3:
                    try{
                        sc.nextLine();
                        System.out.print("Name Procduct Need To Find ");
                        String name;
                        name = sc.nextLine();
                        m.searchShoes(name);
                    }catch(Exception e ){
                        System.out.println("Error : "+e.getMessage());
                    }
                    break ;
                case 4:
                    try{
                        System.out.println("Total Money: "+m.totalTax());
                    }catch(Exception e ){
                        System.out.println("Error: "+e.getMessage());
                    }
                    break ;
                case 5:
                    m.output();
                    break;
                case 6:
                    System.out.println("Exits!!!");
                    return;
                default :
                    System.out.println("Choice Fail");
                    break;               
            }
        }while(true);
    }
}

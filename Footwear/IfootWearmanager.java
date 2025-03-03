package Footwear;
public interface IfootWearmanager {
    void addShoes(shoes e) throws Exception ; 
    void delShoes(shoes e )throws Exception ;
    void searchShoes(String name) throws Exception ;
    double totalTax() throws Exception;
}

package Account;


public class Account {
    private String name, pass , gmail ; 
    public Account( String name, String pass, String gmail) {
        this.name = name;
        this.pass = pass;
        this.gmail = gmail;
    }
    public Account(){}
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

   
}

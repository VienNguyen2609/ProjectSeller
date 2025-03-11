package AccountData;
public class Account {
    private String name, pass , gmail ; 
    private int idUser ;
    public Account(int idUser ,String name, String pass, String gmail) {
        this.idUser = idUser;
        this.name = name;
        this.pass = pass;
        this.gmail = gmail;
    }
    public Account(){}

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

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

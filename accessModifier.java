package OOPS_By_Apna_College;
class Account {
    public String name;
    protected String eMail;
    private String password;

    // getters & setters for using a private
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String pass) {
        this.password = pass;
    }
}

public class accessModifier {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "Sayan Banik";
        account1.eMail = "sayanbanikcob@gmail.com";

        // Uncommenting the line below will result in a compilation error
        // because password is private
        // account1.password = "Sa32432/-@#354";

        account1.setPassword("F1M<il6!']I0q>$");
        System.out.println("Your Password is: "+account1.getPassword());
    }
}

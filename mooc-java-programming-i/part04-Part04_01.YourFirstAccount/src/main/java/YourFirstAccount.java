public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        
        Account gdnAccount = new Account("Gideon", 100.0);
        
        gdnAccount.deposit(20.0);
        
        System.out.println(gdnAccount);
    }
}

package Factory;

public class OpenAccount {
    
    
    private BankAccountFactory bankAccountFactory;
    
    //constructor
    public OpenAccount (BankAccountFactory bankAF){
        this.bankAccountFactory= bankAF;
    }
    
    //method Open Account to Client
    public void openAccount (TypeEnum typeEnum) {
        
        //checking for type of account
        BankAccount bankAccount = bankAccountFactory.createAccount(typeEnum);
       
        System.out.println("Choosen bank account is: " + bankAccount);
    }
   
}

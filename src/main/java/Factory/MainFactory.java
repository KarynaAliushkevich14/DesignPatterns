package Factory;

public class MainFactory {
    
    public static void main(String[] args) {
        
        
    BankAccountFactory bankAccountFactory = new BankAccountFactory();
    OpenAccount open = new OpenAccount (bankAccountFactory);
    
    bankAccountFactory.createAccount(TypeEnum.PERSONAL);
    
    
    } 
}

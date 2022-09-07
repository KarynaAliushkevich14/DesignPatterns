package Factory;

public class BankAccountFactory {

    
    
    //method to split BankAccounts logicaly
    public BankAccount createAccount (TypeEnum typeEnum){
        
        BankAccount bankAccount = null;    
        
        switch (typeEnum) {
            case PERSONAL:
                bankAccount = new PersonalAccount();
                break;
             case BUSINESS:
                bankAccount = new BusinessAccount();
                break;  
             case CHECKING:
                bankAccount = new CheckingAccount();
                break;    
        }
        return bankAccount;
    }
    
}

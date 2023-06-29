package FactoryDP.Bank;

public class BankAccountFactory {
    
    public BankAccount getBankAccount(String bankAccount){
        if(bankAccount.equalsIgnoreCase("Current")){
            return new CurrentAccount();
        }
        else if(bankAccount.equalsIgnoreCase("Joint")){
            return new JointAccount();
        }
        else if(bankAccount.equalsIgnoreCase("Savings")){
            return new SavingsAccount();
        }
        return new NULLAccount();
    }
}

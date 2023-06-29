package FactoryDP.Bank;

public class CurrentAccount implements BankAccount{
    
    @Override
    public void withdraw(){
        System.out.println("Current Account :: withdraw()");
    }
}

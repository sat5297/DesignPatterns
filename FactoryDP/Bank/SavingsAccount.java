package FactoryDP.Bank;

public class SavingsAccount implements BankAccount{
    
    @Override
    public void withdraw(){
        System.out.println("Savings Account :: withdraw()");
    }
}

package FactoryDP.Bank;

public class NULLAccount implements BankAccount{
    
    @Override
    public void withdraw(){
        System.out.println("NULL Account cannot withdraw.");
    }
}

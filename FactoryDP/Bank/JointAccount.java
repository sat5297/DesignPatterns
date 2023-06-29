package FactoryDP.Bank;

public class JointAccount implements BankAccount{
    
    @Override
    public void withdraw(){
        System.out.println("Joint Account :: Withdraw()");
    }
}

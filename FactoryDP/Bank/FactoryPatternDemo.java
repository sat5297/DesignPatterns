package FactoryDP.Bank;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        BankAccountFactory bankAccountFactory = new BankAccountFactory();
        BankAccount savingsBankAccount = bankAccountFactory.getBankAccount("Savings");
        savingsBankAccount.withdraw();

        BankAccount currentBankAccount = bankAccountFactory.getBankAccount("Current");
        currentBankAccount.withdraw();

        BankAccount jointBankAccount = bankAccountFactory.getBankAccount("Joint");
        jointBankAccount.withdraw();

        BankAccount anotherBankAccount = bankAccountFactory.getBankAccount("Business");
        anotherBankAccount.withdraw();
    }
}
